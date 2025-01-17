# -*- coding: utf-8 -*-

import click
from click._bashcomplete import get_choices


def choices_without_help(cli, args, incomplete):
    completions = get_choices(cli, 'dummy', args, incomplete)
    return [c[0] for c in completions]


def choices_with_help(cli, args, incomplete):
    return list(get_choices(cli, 'dummy', args, incomplete))


def test_single_command():
    @click.command()
    @click.option('--local-opt')
    def cli(local_opt):
        pass

    assert choices_without_help(cli, [], '-') == ['--local-opt']
    assert choices_without_help(cli, [], '') == []


def test_boolean_flag():
    @click.command()
    @click.option('--shout/--no-shout', default=False)
    def cli(local_opt):
        pass

    assert choices_without_help(cli, [], '-') == ['--shout', '--no-shout']


def test_multi_value_option():
    @click.group()
    @click.option('--pos', nargs=2, type=float)
    def cli(local_opt):
        pass

    @cli.command()
    @click.option('--local-opt')
    def sub(local_opt):
        pass

    assert choices_without_help(cli, [], '-') == ['--pos']
    assert choices_without_help(cli, ['--pos'], '') == []
    assert choices_without_help(cli, ['--pos', '1.0'], '') == []
    assert choices_without_help(cli, ['--pos', '1.0', '1.0'], '') == ['sub']


def test_multi_option():
    @click.command()
    @click.option('--message', '-m', multiple=True)
    def cli(local_opt):
        pass

    assert choices_without_help(cli, [], '-') == ['--message', '-m']
    assert choices_without_help(cli, ['-m'], '') == []


def test_small_chain():
    @click.group()
    @click.option('--global-opt')
    def cli(global_opt):
        pass

    @cli.command()
    @click.option('--local-opt')
    def sub(local_opt):
        pass

    assert choices_without_help(cli, [], '') == ['sub']
    assert choices_without_help(cli, [], '-') == ['--global-opt']
    assert choices_without_help(cli, ['sub'], '') == []
    assert choices_without_help(cli, ['sub'], '-') == ['--local-opt']


def test_long_chain():
    @click.group('cli')
    @click.option('--cli-opt')
    def cli(cli_opt):
        pass

    @cli.group('asub')
    @click.option('--asub-opt')
    def asub(asub_opt):
        pass

    @asub.group('bsub')
    @click.option('--bsub-opt')
    def bsub(bsub_opt):
        pass

    COLORS = ['red', 'green', 'blue']
    def get_colors(ctx, args, incomplete):
        for c in COLORS:
            if c.startswith(incomplete):
                yield c

    def search_colors(ctx, args, incomplete):
        for c in COLORS:
            if incomplete in c:
                yield c

    CSUB_OPT_CHOICES = ['foo', 'bar']
    CSUB_CHOICES = ['bar', 'baz']
    @bsub.command('csub')
    @click.option('--csub-opt', type=click.Choice(CSUB_OPT_CHOICES))
    @click.option('--csub', type=click.Choice(CSUB_CHOICES))
    @click.option('--search-color', autocompletion=search_colors)
    @click.argument('color', autocompletion=get_colors)
    def csub(csub_opt, color):
        pass

    assert choices_without_help(cli, [], '-') == ['--cli-opt']
    assert choices_without_help(cli, [], '') == ['asub']
    assert choices_without_help(cli, ['asub'], '-') == ['--asub-opt']
    assert choices_without_help(cli, ['asub'], '') == ['bsub']
    assert choices_without_help(cli, ['asub', 'bsub'], '-') == ['--bsub-opt']
    assert choices_without_help(cli, ['asub', 'bsub'], '') == ['csub']
    assert choices_without_help(cli, ['asub', 'bsub', 'csub'], '-') == ['--csub-opt', '--csub', '--search-color']
    assert choices_without_help(cli, ['asub', 'bsub', 'csub', '--csub-opt'], '') == CSUB_OPT_CHOICES
    assert choices_without_help(cli, ['asub', 'bsub', 'csub'], '--csub') == ['--csub-opt', '--csub']
    assert choices_without_help(cli, ['asub', 'bsub', 'csub', '--csub'], '') == CSUB_CHOICES
    assert choices_without_help(cli, ['asub', 'bsub', 'csub', '--csub-opt'], 'f') == ['foo']
    assert choices_without_help(cli, ['asub', 'bsub', 'csub'], '') == COLORS
    assert choices_without_help(cli, ['asub', 'bsub', 'csub'], 'b') == ['blue']
    assert choices_without_help(cli, ['asub', 'bsub', 'csub', '--search-color'], 'een') == ['green']


def test_chaining():
    @click.group('cli', chain=True)
    @click.option('--cli-opt')
    def cli(cli_opt):
        pass

    @cli.command()
    @click.option('--asub-opt')
    def asub(asub_opt):
        pass

    @cli.command(help='bsub help')
    @click.option('--bsub-opt')
    @click.argument('arg', type=click.Choice(['arg1', 'arg2']), required=True)
    def bsub(bsub_opt, arg):
        pass

    @cli.command()
    @click.option('--csub-opt')
    @click.argument('arg', type=click.Choice(['carg1', 'carg2']), required=False)
    def csub(csub_opt, arg):
        pass

    assert choices_without_help(cli, [], '-') == ['--cli-opt']
    assert choices_without_help(cli, [], '') == ['asub', 'bsub', 'csub']
    assert choices_without_help(cli, ['asub'], '-') == ['--asub-opt']
    assert choices_without_help(cli, ['asub'], '') == ['bsub', 'csub']
    assert choices_without_help(cli, ['bsub'], '') == ['arg1', 'arg2']
    assert choices_without_help(cli, ['asub', '--asub-opt'], '') == []
    assert choices_without_help(cli, ['asub', '--asub-opt', '5', 'bsub'], '-') == ['--bsub-opt']
    assert choices_without_help(cli, ['asub', 'bsub'], '-') == ['--bsub-opt']
    assert choices_with_help(cli, ['asub'], 'b') == [('bsub', 'bsub help')]
    assert choices_without_help(cli, ['asub', 'csub'], '-') == ['--csub-opt']


def test_argument_choice():
    @click.command()
    @click.argument('arg1', required=False, type=click.Choice(['arg11', 'arg12']))
    @click.argument('arg2', required=False, type=click.Choice(['arg21', 'arg22']))
    @click.argument('arg3', required=False, type=click.Choice(['arg', 'argument']))
    def cli():
        pass

    assert choices_without_help(cli, [], '') == ['arg11', 'arg12']
    assert choices_without_help(cli, [], 'arg') == ['arg11', 'arg12']
    assert choices_without_help(cli, ['arg11'], '') == ['arg21', 'arg22']
    assert choices_without_help(cli, ['arg12', 'arg21'], '') == ['arg', 'argument']
    assert choices_without_help(cli, ['arg12', 'arg21'], 'argu') == ['argument']


def test_option_choice():
    @click.command()
    @click.option('--opt1', type=click.Choice(['opt11', 'opt12']), help='opt1 help')
    @click.option('--opt2', type=click.Choice(['opt21', 'opt22']))
    @click.option('--opt3', type=click.Choice(['opt', 'option']))
    def cli():
        pass

    assert choices_with_help(cli, [], '-') == [('--opt1', 'opt1 help'),
                                               ('--opt2', None),
                                               ('--opt3', None)]
    assert choices_without_help(cli, [], '--opt') == ['--opt1', '--opt2', '--opt3']
    assert choices_without_help(cli, [], '--opt1=') == ['opt11', 'opt12']
    assert choices_without_help(cli, [], '--opt2=') == ['opt21', 'opt22']
    assert choices_without_help(cli, ['--opt2'], '=') == ['opt21', 'opt22']
    assert choices_without_help(cli, ['--opt2', '='], 'opt') == ['opt21', 'opt22']
    assert choices_without_help(cli, ['--opt1'], '') == ['opt11', 'opt12']
    assert choices_without_help(cli, ['--opt2'], '') == ['opt21', 'opt22']
    assert choices_without_help(cli, ['--opt1', 'opt11', '--opt2'], '') == ['opt21', 'opt22']
    assert choices_without_help(cli, ['--opt2', 'opt21'], '-') == ['--opt1', '--opt3']
    assert choices_without_help(cli, ['--opt1', 'opt11'], '-') == ['--opt2', '--opt3']
    assert choices_without_help(cli, ['--opt1'], 'opt') == ['opt11', 'opt12']
    assert choices_without_help(cli, ['--opt3'], 'opti') == ['option']

    assert choices_without_help(cli, ['--opt1', 'invalid_opt'], '-') == ['--opt2', '--opt3']


def test_option_and_arg_choice():
    @click.command()
    @click.option('--opt1', type=click.Choice(['opt11', 'opt12']))
    @click.argument('arg1', required=False, type=click.Choice(['arg11', 'arg12']))
    @click.option('--opt2', type=click.Choice(['opt21', 'opt22']))
    def cli():
        pass

    assert choices_without_help(cli, ['--opt1'], '') == ['opt11', 'opt12']
    assert choices_without_help(cli, [''], '--opt1=') == ['opt11', 'opt12']
    assert choices_without_help(cli, [], '') == ['arg11', 'arg12']
    assert choices_without_help(cli, ['--opt2'], '') == ['opt21', 'opt22']


def test_boolean_flag_choice():
    @click.command()
    @click.option('--shout/--no-shout', default=False)
    @click.argument('arg', required=False, type=click.Choice(['arg1', 'arg2']))
    def cli(local_opt):
        pass

    assert choices_without_help(cli, [], '-') == ['--shout', '--no-shout']
    assert choices_without_help(cli, ['--shout'], '') == ['arg1', 'arg2']


def test_multi_value_option_choice():
    @click.command()
    @click.option('--pos', nargs=2, type=click.Choice(['pos1', 'pos2']))
    @click.argument('arg', required=False, type=click.Choice(['arg1', 'arg2']))
    def cli(local_opt):
        pass

    assert choices_without_help(cli, ['--pos'], '') == ['pos1', 'pos2']
    assert choices_without_help(cli, ['--pos', 'pos1'], '') == ['pos1', 'pos2']
    assert choices_without_help(cli, ['--pos', 'pos1', 'pos2'], '') == ['arg1', 'arg2']
    assert choices_without_help(cli, ['--pos', 'pos1', 'pos2', 'arg1'], '') == []


def test_multi_option_choice():
    @click.command()
    @click.option('--message', '-m', multiple=True, type=click.Choice(['m1', 'm2']))
    @click.argument('arg', required=False, type=click.Choice(['arg1', 'arg2']))
    def cli(local_opt):
        pass

    assert choices_without_help(cli, ['-m'], '') == ['m1', 'm2']
    assert choices_without_help(cli, ['-m', 'm1', '-m'], '') == ['m1', 'm2']
    assert choices_without_help(cli, ['-m', 'm1'], '') == ['arg1', 'arg2']


def test_variadic_argument_choice():
    @click.command()
    @click.argument('src', nargs=-1, type=click.Choice(['src1', 'src2']))
    def cli(local_opt):
        pass

    assert choices_without_help(cli, ['src1', 'src2'], '') == ['src1', 'src2']


def test_long_chain_choice():
    @click.group()
    def cli():
        pass

    @cli.group()
    @click.option('--sub-opt', type=click.Choice(['subopt1', 'subopt2']))
    @click.argument('sub-arg', required=False, type=click.Choice(['subarg1', 'subarg2']))
    def sub(sub_opt):
        pass

    @sub.command(short_help='bsub help')
    @click.option('--bsub-opt', type=click.Choice(['bsubopt1', 'bsubopt2']))
    @click.argument('bsub-arg1', required=False, type=click.Choice(['bsubarg1', 'bsubarg2']))
    @click.argument('bbsub-arg2', required=False, type=click.Choice(['bbsubarg1', 'bbsubarg2']))
    def bsub(bsub_opt):
        pass

    assert choices_with_help(cli, ['sub'], '') == [('subarg1', None), ('subarg2', None), ('bsub', 'bsub help')]
    assert choices_without_help(cli, ['sub', '--sub-opt'], '') == ['subopt1', 'subopt2']
    assert choices_without_help(cli, ['sub', '--sub-opt', 'subopt1'], '') == \
        ['subarg1', 'subarg2', 'bsub']
    assert choices_without_help(cli,
        ['sub', '--sub-opt', 'subopt1', 'subarg1', 'bsub'], '-') == ['--bsub-opt']
    assert choices_without_help(cli,
        ['sub', '--sub-opt', 'subopt1', 'subarg1', 'bsub', '--bsub-opt'], '') == \
        ['bsubopt1', 'bsubopt2']
    assert choices_without_help(cli,
        ['sub', '--sub-opt', 'subopt1', 'subarg1', 'bsub', '--bsub-opt', 'bsubopt1', 'bsubarg1'],
                            '') == ['bbsubarg1', 'bbsubarg2']