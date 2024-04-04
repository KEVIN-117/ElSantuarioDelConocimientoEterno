def series_sum(n):
    if n == 1 or n == 0:
        return n
    print((1 / (3 * n - 2))+n-1)
    return (1 / (3 * n - 2)) + series_sum(n - 1)


print(str(round(series_sum(5), 2)))