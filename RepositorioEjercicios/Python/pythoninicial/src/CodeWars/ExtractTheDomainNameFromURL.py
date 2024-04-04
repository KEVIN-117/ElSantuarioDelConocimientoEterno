
import re
def domain_name(url):
    x = re.split(r'(?:https?://)?(?:www\.)?([^./]+)', url)
    return x

def domain_name_two(url):
    return re.search('(https?://)?(www\d?\.)?(?P<name>[\w-]+)\.', url).group('name')


domain_name("http://github.com/carbonfive/raygun")
domain_name("www.xakep.ru")