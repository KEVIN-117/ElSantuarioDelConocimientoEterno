def sum_two_smallest_numbers(numbers):
    #your code here
    res = list(numbers)
    res.sort()
    return res[0]+res[1]


def sum_two_smallest_numbers2(numbers):
    return sum(sorted(numbers)[:2])


print(sum_two_smallest_numbers([5, 18, 2, 8, 22]))
print(sum_two_smallest_numbers([5, 8, 12, 18, 22]))
print(sum_two_smallest_numbers([7, 15, 12, 18, 22]))
print(sum_two_smallest_numbers([25, 42, 12, 18, 22]))