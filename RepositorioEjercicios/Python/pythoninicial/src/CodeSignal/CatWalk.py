import re


def solution(code: str):
    return re.sub(r'\s+', ' ', code.strip())


print(solution("def      m   e  gaDifficu     ltFun        ction(x):"))
