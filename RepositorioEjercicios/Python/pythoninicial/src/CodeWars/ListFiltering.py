def filter_list(l):
    'return a new list with the strings filtered out'
    return list(filter(lambda item: str(item).isnumeric() and not str(type(item)) == "<class 'str'>", list(l)))


def filter_list2(l):
    'return a new list with the strings filtered out'
    return list(filter(lambda item: not type(item) is str, list(l)))


print(filter_list([1,2,'a','b']))
print(filter_list([1,'a','b',0,15]))
print(filter_list([1,2,'aasf','1','123',123]))

