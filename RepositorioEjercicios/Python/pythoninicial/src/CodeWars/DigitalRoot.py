def digital_root2(n):
    return n if n < 10 else digital_root(sum(map(int, str(n))))


def digital_root3(n):
    return n % 9 or n and 9


def digital_root(n):
    if n // 10 == 0:
        return n
    else:
        aux = 0
        while n != 0:
            aux = aux + n % 10
            n = n // 10
        return digital_root(aux)


print(digital_root(493193))
print(2 // 10)
