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
        sum3 = sum(arr[length2:])
        sum4 = sum(arr[:length2 - 1])
        if sum1 == sum2:
            return length1 - 1
        elif sum3 == sum4:
            return length2 - 1
        compare = length1 - 1
        if compare != 0:
            length1 = compare
        elif not compare < 0:
            break
        length2 += 1

    return -1