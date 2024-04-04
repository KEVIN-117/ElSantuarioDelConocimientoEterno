def solution(n):
    if str(n).isdecimal():
        return n % 2
    else:
        return -1


print(solution(15))
print(solution(23.12))