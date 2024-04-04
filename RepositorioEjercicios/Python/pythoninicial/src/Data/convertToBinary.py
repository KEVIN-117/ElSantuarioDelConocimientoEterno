import math
from builtins import print
def binary(x: str):
    return list(map(lambda item: bin(int(item)).replace("0b", ""), x.split(".")))

def convert_to_vinary(inputList: str):
    div = list()
    y = -1
    for i in range(8):
        y += 1
        div.append(int(math.pow(2, y)))
    div = div[::-1]
    index = 0
    for i in list(map(lambda x: int(x), inputList.split("."))):
        while i != 0:
            if i >= div[index]:
                i = i // div[index]
                print(i)
            else:
                index += 1


    print(div)


if __name__ == '__main__':
    print(binary('173.25.255.128'))
    print(binary("20.40.50.65"))
    print(binary("10.35.129.15"))
    print(binary("69.55.138.201"))
