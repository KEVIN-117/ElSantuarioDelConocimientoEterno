while True:
    n = int(input())
    values = 0
    while n != 1:
        if n % 2 == 0:
            n = n / 2
            values = values + 1
        else:
            n = 3 * n + 1
            values = values + 1
    print(values)


