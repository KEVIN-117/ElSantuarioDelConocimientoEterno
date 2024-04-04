import pandas as pd

print(pd.__version__)

data = {
    "calories": [20, 30, 52, 62],
    "duration": [20, 41, 85, 65]
}

# df = pd.DataFrame(data=data, index=['day 1', 'day 2', 'day 3', 'day 4'])

# print(df.loc[['day 1', 'day 3']])


# reading files

df = pd.read_csv("../Datas/computer_games.csv")
print(df.shape)
# print(df.to_string())

print(df.head().to_string())

print("Info method")
print(df.info())

print("Describe method")
print(df.describe())

print("contar valores unicos")
# print(df['Name'].value_counts().to_string())

# Date Time of Day  Placed Mental State  Eliminations  Assists  Revives Accuracy  Hits  Head Shots  Distance Traveled  Materials Gathered  Materials Used  Damage Taken  Damage to Players  Damage to Structures
print("Filtrado de datos")
df = pd.read_csv('../Datas/FortniteStatistics.csv')
print(df.loc[[0, 1, 10], ['Eliminations', 'Assists', 'Hits', 'Date']])

