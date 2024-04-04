def fun(a, b):
    k, n = list(map(lambda x: float(x), a.split(" ")))
    s, d = list(map(lambda x: float(x), b.split(" ")))
    result = ((d - (k * s) / n) * n) / (n - k)
    if result >= 100:
        return "impossible"
    else:
        if len(str(result).split(".")[1]) < 2:
            return "{:.2f}".format(result)
        return round(result, 7)

