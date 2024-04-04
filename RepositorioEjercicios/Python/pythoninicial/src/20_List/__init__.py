a = [1,2,3,4]
a.append(5)
b = [6,7]
a.append(b)
print(a)
print(a[5])
a.extend(b)
print(a)

b.extend(range(3))
print(b)

a.clear()
a = [1,2,3,4,5]+[6,7,8]+b
print(a)

print(a[4])
a.reverse()
print(a)

print(a.count(7))

print(a)
a.sort()
print(a)
a.sort(reverse=True)
print(a)
