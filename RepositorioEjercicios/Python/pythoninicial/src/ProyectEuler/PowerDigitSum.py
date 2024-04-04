

def PowerDigitSum():

    """
    215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    :return: What is the sum of the digits of the number 21000?
    """
    return sum(list(map(lambda x: int(x), list(str(2 ** 1000)))))


print(PowerDigitSum())