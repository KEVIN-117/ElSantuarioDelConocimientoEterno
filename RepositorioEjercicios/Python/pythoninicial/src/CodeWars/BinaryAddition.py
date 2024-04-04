def add_binary(a, b):
    """
    :param {int} a: 
    :param {int} b: 
    :return: {str} a+b emn binario
    """
    return format(a+b, "b")


print(add_binary(1,1))
print(type(add_binary(1,1)))
print(add_binary(2, 2))
print(add_binary(5, 9))
print(add_binary(51, 12))
