def solution(N: int):
    """
    insert 0 5
    insert 1 10
    insert 0 6
    print
    remove 6
    append 9
    append 1
    sort
    print
    pop
    reverse
    print
    """
    a: list = []
    i: int = 0
    while i < N:
        option: str = input()
        if option.find("insert") >= 0:
            _, index, value = option.split(" ")
            a.insert(int(index), int(value))
        elif option.find("print") >= 0:
            print(a)
        elif option.find("remove") >= 0:
            _, index = option.split(" ")
            a.pop(int(index))
        elif option.find("append") >= 0:
            _, value = option.split(" ")
            a.append(value)
        elif option.find("sort") >= 0:
            a.sort()
        elif option.find("pop") >= 0:
            a.pop(len(a) - 1)
        elif option.find("reverse") >= 0:
            a.reverse()

if __name__ == '__main__':
    N = int(input())
    solution(N)
