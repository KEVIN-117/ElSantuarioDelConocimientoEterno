import pandas as pd

# creamos un dataFrame
df = pd.read_csv('../Datas/winemag-data_first150k.csv')
# nos da una información detallada
print(df.info())

""" 
 country 
 description 
 designation 
 points  
 price
 province 
 region_1 
 region_2 
 variety 
 winery
"""

# operaciones matemáticas básicas en columnas

# suma
df['suma points, price'] = df['points'] + df['price']
print(df.head().to_string())

df2 = pd.read_csv("./myData.csv")
# Rellenando nulos
# df2.to_csv("myData.csv", index=False)
# df2.fillna("sin valor", inplace=True)
print(df2)

# Eliminando nulos
df2.dropna(subset=['Name'], inplace=True)
print("\n")
print(df2)

# sort data
df_ordenado = df2.sort_values(by='Last Name', ascending=True)
print("\n")
print(df_ordenado)

# calculo estadístico resumido
print("\n")
print(df2.describe())

# agregar nuevas columnas
df2["age"] = [21, None, 21, None]

df2 = df2.append({'Name': 'Carlos', 'Last Name': 'Carlos'}, ignore_index=True)
print("\n")
print(df2)

df2.drop(columns=['age'], inplace=True)
print("\n")
print(df2)

