from Person import Person


class Student(Person):
    university: str

    def __init__(self, name, last_name, ci, date, university):
        super().__init__(name, last_name, ci, date)
        self.university = university

    def printData(self):
        return super().printData()
