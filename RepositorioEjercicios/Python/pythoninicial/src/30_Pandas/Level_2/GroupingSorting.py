from builtins import print

import pandas as pd

df = pd.read_csv("./Data.csv")

# print(df.head().to_string())
print(df)
print("\n")
ventas = df.groupby('Categoria').Ventas.sum().reset_index()
# El método reset_index() en Pandas se utiliza para restablecer (reiniciar) el índice de un DataFrame después de realizar alguna operación que haya modificado su estructura
print(ventas)

# Ejercicio 2
df = pd.read_csv('../Datas/winemag-data-130k-v2.csv')
df.drop(columns=['Unnamed: 0'], inplace=True)
print(df.head().to_string())

print("\n")
points = df.groupby(['country', 'province']).points.sum().reset_index()
print(points.head().to_string())

# Funciones de Agregación `sum()`, `mean()`, `median()`, `min()`, `max()`, `count()`

print("\nsum")
points = df.groupby(['country', 'province']).points.sum()
print(points.head().to_string())

print("\n")

print("\nmean")
points = df.groupby(['country', 'province']).points.mean()
print(points.head().to_string())

print("\n")

print("\nmedian")
points = df.groupby(['country', 'province']).points.median()
print(points.head().to_string())

print("\n")

print("\nmin")
points = df.groupby(['country', 'province']).points.min()
print(points.head().to_string())

print("\n")

print("\nmax")
points = df.groupby(['country', 'province']).points.max()
print(points.head().to_string())

print("\n")

print("\ncount")
points = df.groupby(['country', 'province']).points.count()
print(points.head().to_string())

print("\n")


print(df.groupby('winery').apply(lambda df: df.title.iloc[0]))