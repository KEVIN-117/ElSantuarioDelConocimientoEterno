import datetime

from Person import Person

from Student import Student

person = Person(name='Kevin', last_name='Rodriguez', ci=8514507, date='17/12/2001')

print(person.__get_name__(), person.__get_last_name__(), person.__get_ci__(), person.__get_age__())

student = Student(name='Alexis', last_name='Rodriguez', ci=8514507, date='12/12/2001', university='universidad autonoma tomas frias')
print(student.printData())
