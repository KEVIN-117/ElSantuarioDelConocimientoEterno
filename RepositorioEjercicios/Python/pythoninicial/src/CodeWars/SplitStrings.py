import re

def solution(s):
    return re.findall(".{2}", s + "_")



def solution2(s):
    result = list()
    index = 0
    if not len(s)%2 == 0:
        s = s+"_"
    print(len(s))
    for i in range(2, len(s)+2, 2):
        save = s[index:i]
        result.append(s[index:i])
        index += 2
    return result


print(solution("asdfadsf"))
print(solution("asd"))
