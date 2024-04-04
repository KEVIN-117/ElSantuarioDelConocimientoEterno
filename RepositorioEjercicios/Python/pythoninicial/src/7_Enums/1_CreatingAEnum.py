from enum import Enum


class User(Enum):
    red = 1
    cian = 2
    blue = 3
print(User.red)
print(User(2))
print(User['blue'])
