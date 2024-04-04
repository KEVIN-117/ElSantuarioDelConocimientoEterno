from array import *
def getElements(array):
    for i in array:
        print(i)
    print("\n")
my_array = array("i", [1,2,3,4,5,6])
getElements(my_array)
#append a value in array
my_array.append(23)
getElements(my_array)
#insert a value in array
my_array.insert(2, 345)
getElements(my_array)
#add items from list
c = [1,2,3]
my_array.fromlist(c)
getElements(my_array)

#remove lement
my_array.remove(2)
getElements(my_array)
# remove last array element
my_array.pop()
getElements(my_array)

#fetch any element
print(my_array.index(2))

#reverse method in python
my_array.reverse()
print(my_array)
#count method
print(my_array.count(2))

#convert array to string
my_char_array = array('c', ['g','e','e','k'])
print(my_char_array.tostring())

