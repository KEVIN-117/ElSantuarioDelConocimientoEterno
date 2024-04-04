import datetime


class User(object):
    def __init__(self, name, last_name, nick_name, birth_day, gender, heigth):
        self.name = name
        self.last_name = last_name
        self.nick_name = nick_name
        self.birth_day = datetime.datetime.strptime(birth_day, "%Y-%m-%d")
        self.gender = gender
        self.heigth = heigth
    def set_age(self):
        return datetime.datetime.today().year-self.birth_day.year
    def __repr__(self):
        return f"this is user whith\n" \
               f"Nick Name:{self.nick_name}\n" \
               f"Name: {self.name}\n" \
               f"Last Name: {self.last_name}\n" \
               f"Age: {self.set_age()}\n" \
               f"Gender: {self.gender}\n" \
               f"Heigth: {self.heigth}"
UsersList = list()
counter = 0
while (True):
    if counter == 0:
        print("______WELCOME TO PROGRAM_____\n")
        counter += 1
    print("1.-Register new User\n2.-List Users\n3.-List users female\n4.-List users male\n0.- exit program")
    option = int(input("Select your option: "))
    if option == 1:
        UsersList.append(User(name=input("Your name: "), last_name=input("Your last name: "), nick_name=input("Your Nick name: "),
             birth_day=input("Your birth day: "), gender=input("Your gender: "), heigth=float(input("Your Heigth: "))))
        print("\n")
    if option == 2:
        for i in UsersList:
            print(i)
        print("\n")
    if option == 3:
        for i in UsersList:
            if i.gender == "Female" or i.gender == "female":
                print(i)
        print("\n")
    if option == 4:
        for i in UsersList:
            if i.gender == "Male" or i.gender == "male":
                print(i)
        print("\n")
    if option == 0:
        print("gracias por usar nuestro servicio".upper())
        break