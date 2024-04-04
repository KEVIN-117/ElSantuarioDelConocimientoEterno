from builtins import list, range

from numpy import number
from numpy.random import random
from unicodedata import name

import random


def randomice():
    names = dict({})
    names['Mauricio'] = ''
    names['Jose'] = ''
    names['Elvis'] = ''
    names['Kevin'] = ''
    names['Alvaro'] = ''
    for i in names:
        numbers = list()
        counter = 1
        while counter <= 23:
            number = random.randint(1 , 117)
            numbers.append(number)
            counter += 1
        print( i + "-> " +  str(numbers))





if __name__ == "__main__":
    print(117/5)
    randomice()