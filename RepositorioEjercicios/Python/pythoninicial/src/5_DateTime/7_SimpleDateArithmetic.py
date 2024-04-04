import datetime as dt
#today
today = dt.date.today()
print("Today: ", today)
#yesterday
yesterday = today - dt.timedelta(days=1)
print("Yesterday: ", yesterday)
#tomorrow
tomorrow = today + dt.timedelta(days=1)
print("Tomorrow: ", tomorrow)
