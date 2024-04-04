from datetime import datetime, timedelta, timezone
JST = timezone(timedelta(hours=+10))
print(JST)
dt = datetime(2015, 1, 1, 12, 0, 0, tzinfo=JST)
print("dt ", dt)
print("tzname ", dt.tzname())
dt = datetime(2015, 1, 1, 12, 0, 0, tzinfo=timezone(timedelta(hours=9), 'JST'))
print(dt.tzname())
print(dt)

#Zonas con horario de verano

