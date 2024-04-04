def get_middle(s):
    return s[len(s) // 2] if not len(s) % 2 == 0 else s[len(s) // 2 -1] + s[len(s) // 2]


def get_middle2(s):
    return s[(len(s)-1)//2:len(s)//2+1]


s = "testing"
print(get_middle(s))
s = "test"
print(get_middle(s))
