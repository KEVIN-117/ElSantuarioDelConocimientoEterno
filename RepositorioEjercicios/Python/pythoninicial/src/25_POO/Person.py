import datetime


class Person(object):
    """
        def __init__(self, name, last_name, ci, age):
        self.name = name
        self.last_name = last_name
        self.ci = ci
        self.age = age
    """
    name: str
    last_name: str
    ci: str
    date: str
    age: int

    def __init__(self, name, last_name, ci, date):
        self.name = name
        self.last_name = last_name
        self.ci = ci
        self.date = date
        self.age = 0

    def __set_name__(self, name):
        self.name = name

    def __set_last_name__(self, last_name):
        self.last_name = last_name

    def __set_ci__(self, ci):
        self.ci = ci

    def __set_age__(self, age):
        self.age = age

    def __get_name__(self):
        return self.name

    def __get_last_name__(self):
        return self.last_name

    def __get_ci__(self):
        return self.ci

    def __get_age__(self):
        """
        :return: age of the person
        """
        return int(str(datetime.datetime.now()).split('-')[0]) - int(self.date.split("/")[2])

    def __get_data__(self):
        return self.__get_name__()


    def printData(self):
        return f'Person [name: {self.name}, lastName: {self.last_name}, ci: {self.ci}, age: {self.__get_age__()}]'
