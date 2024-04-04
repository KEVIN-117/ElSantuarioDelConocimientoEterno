def solution(code: str, x):
    return code.replace("\t", ' '*x)


print(solution("\treturn False", 3))