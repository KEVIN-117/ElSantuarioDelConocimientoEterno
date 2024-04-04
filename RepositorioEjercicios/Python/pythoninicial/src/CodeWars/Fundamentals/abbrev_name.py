def abbrev_name(name):
    return '.'.join((w[0].upper() for w in name.split(" ")))


print(abbrev_name("kevin Alexis"))