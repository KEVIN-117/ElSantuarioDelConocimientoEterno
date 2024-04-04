def find_even_index(arr):
    # your code here
    if sum(arr) == 0:
        return 0
    sumLeft = 0
    sumRidth = 0
    length1 = len(arr) // 2 + 1 if not len(arr) % 2 == 0 else len(arr) // 2
    length2 = len(arr) // 2 + 1 if not len(arr) % 2 == 0 else len(arr) // 2
    while True:
        sum1 = sum(arr[:length1 - 1])
        sum2 = sum(arr[length1:])
        if sum1 == sum2:
            return length1 - 1
        compare = length1 - 1
        if compare != 0:
            length1 = compare
        elif not compare < 0:
            break
    while True:
        sum3 = sum(arr[length2:])
        sum4 = sum(arr[:length2])
        if sum3 == sum4:
            return length2 - 1
        compare = length1 - 1
        if compare != 0:
            length1 = compare
        elif not compare < 0:
            break
        length2 += 1
    return -1


print(find_even_index([1, 2, 3, 4, 3, 2, 1]))
print(find_even_index([1, 100, 50, -51, 1, 1]))
print(find_even_index([1, 2, 3, 4, 5, 6]))
print(find_even_index([20, 10, 30, 10, 10, 15, 35]))
print(find_even_index([20, 10, -80, 10, 10, 15, 35]))
print(find_even_index([10, -80, 10, 10, 15, 35, 20]))
print(find_even_index(list(range(1, 100))))
print(find_even_index([0,0,0,0,0]))
print(find_even_index([-1,-2,-3,-4,-3,-2,-1]))
print(find_even_index(list(range(-100,-1))))
print(find_even_index([2]))
print(find_even_index([19, -1, 3, 3, 7, -2, -11, 19, -2, 3, -1, 13, 5]))
print(find_even_index([6, 55, 2, 14, 4, 8, 11, -19, -6, 19, 1, -19, 4, 8, 11, 6, 2, 14, 16, 9, 6, -19, 6, 17]))
print(find_even_index([12, -17, -11, 18, -17, -10, 12, -20, 0, 17, 4, 12, -14, 9, 2, 9, -13, -8, -19, -10, -20, 4, 17, 18, -17, -8, 12, 9, -14, 9, 12, -13, -11, 12, 2, -17, 0]))