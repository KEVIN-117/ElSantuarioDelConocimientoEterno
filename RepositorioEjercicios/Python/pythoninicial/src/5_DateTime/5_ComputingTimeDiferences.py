from datetime import datetime, timedelta
def computingTimeDifferences():
    now = datetime.now()
    then = datetime(2023, 1, 28, 13, 30, 40)
    return now-then
delta = computingTimeDifferences()
print("Delta ", delta)
print("Dais", delta.days)
print("Second ", delta.seconds)