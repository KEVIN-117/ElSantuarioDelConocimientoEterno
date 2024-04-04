import datetime as dt
#objeto date
today = dt.datetime.today()
print(today)
today = dt.date.today()
print(today)
today = dt.date(2020, 1, 27)
print(today)

#objeto time
noon = dt.time(12, 0)
print("noon ", noon)

#Hora de la fecha actual
now = dt.datetime.now()
print("now ", now)

#Objeto DateTime
milleniun = dt.datetime(2000, 1, 1, 0, 0, 0)
print("milleniun ", milleniun)

print('Time since the millenium at midnight: ', dt.datetime(today.year, today.month, today.day) - milleniun)
print('Time since the millenium at noon: ', dt.datetime.combine(today, noon) - milleniun)
