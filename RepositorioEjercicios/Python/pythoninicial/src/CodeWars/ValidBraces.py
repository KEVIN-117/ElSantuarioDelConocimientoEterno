def valid_braces(string):
    listOpen = []
    listClose = []
    for k in range(len(string)):
        if string[k] == '[' or string[k] == '{' or string[k] == '(':
            listOpen.append(string[k])
        elif string[k] == ']' or string[k] == '}' or string[k] == ')':
            listClose.append(string[k])
    listResult = []
    for i in range(len(listOpen)):
        if listOpen[i] == '{' and listClose[i] == '}'\
                or listOpen[i] == '[' and listClose[i] == ']'\
                or listOpen[i] == '(' and listClose[i] == ')':
            listResult.append(listOpen[i] + listClose[i])
    return listResult


print(valid_braces("(){}[]"))
print(valid_braces("()"))
print(valid_braces("(}"))
print(valid_braces("[]"))
print(valid_braces("[(])"))
print(valid_braces("{}"))
print(valid_braces("{}()[]"))
print(valid_braces("([{}])"))
print(valid_braces("([}{])"))
print(valid_braces("{}({})[]"))
print(valid_braces("(({{[[]]}}))"))
print(valid_braces("(((({{"))
print(valid_braces(")(}{]["))
print(valid_braces("())({}}{()][]["))
