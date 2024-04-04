def high_and_low(numbers):
    # ...
    intNumbers = list(map(lambda x: int(x), numbers.split()))
    return str(max(intNumbers)) + " " + str(min(intNumbers))


if __name__ == '__main__':
    print(high_and_low("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    print(high_and_low("1 2 3"))