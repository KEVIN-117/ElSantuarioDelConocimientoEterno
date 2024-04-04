cube = lambda x: x**x # complete the lambda function

def fibonacci(n):
    # return a list of fibonacci numbers
    fiboList = list()
    num1 = 0
    num2 = 1
    sum = 0
    fiboList.append(sum)
    for i in range(n):
        num1 = num2
        num2 = sum
        sum = num1 + num2
        fiboList.append(sum)
    return fiboList


if __name__ == '__main__':
    print(map(fibonacci(5)))