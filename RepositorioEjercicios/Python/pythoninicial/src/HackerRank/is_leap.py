def is_leap(year):
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False


if __name__ == '__main__':
    print(is_leap(2000))
    print(is_leap(2400))
    print(is_leap(1800))
    print(is_leap(1900))
    print(is_leap(1992))
