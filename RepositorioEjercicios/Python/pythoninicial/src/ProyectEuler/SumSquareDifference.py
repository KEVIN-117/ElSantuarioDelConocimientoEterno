import math


def SumDquareDifference():
    """
    :var:Sum Square Difference
    :return:Find the difference between the sum of the squares of the first one hundred
    natural numbers and the square of the sum.
    """
    numbers = list(range(1, 100+1))

    return int(math.pow(sum(numbers), 2) - sum(list(map(lambda x : int(math.pow(x,2)), numbers))))


print(SumDquareDifference())