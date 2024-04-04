from builtins import print

def sum_array(array: list):
    return sum(array)


if __name__ == '__main__':
    print(sum_array([]))
    print(sum_array([1, 2, 3]))
    print(sum_array([1.1, 2.2, 3.3]))
    print(sum_array([4, 5, 6]))
    print(sum_array(range(101)))