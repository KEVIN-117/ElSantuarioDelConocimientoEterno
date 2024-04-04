import pandas as pd

# Index-based selection
df = pd.read_csv('../Datas/winemag-data_first150k.csv')
df.drop(columns='Unnamed: 0', inplace=True)
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
print(df.head().to_string())

# Para seleccionar la primera fila de datos en un DataFrame, podemos usar lo siguiente:
print(df.iloc[0])

# Para obtener una columna con iloc, podemos hacer lo siguiente:
print("\n")
print(df.iloc[:, 0])

# para seleccionar la columna de país solo de la primera, segunda y tercera fila, haríamos:
print("\n")
print(df.iloc[1:4, 0])

# También es posible pasar una lista:
print("\n")
print(df.iloc[[0, 2, 4, 6, 8, 10], 0])

# Selección basada en etiquetas
print("\n")
print(df.country)
print("\n")
print(df.loc[0, 'country'])

print("\n")
print(df.loc[:, ['country', 'points', 'price']])

print("\n")
# df.set_index('Index')
# print(df)


# Conditional selection
print("\n")
print(df[df.country == 'Italy'])

print("\n")
print(df.loc[(df.country == 'Italy') & (df.points >= 90), ['country', 'points']])

print("\n")
print(df.loc[(df.country == 'Italy') | (df.points >= 90), ['country', 'points']])

# Pandas viene con algunos selectores condicionales integrados, dos de los cuales destacaremos aquí.
# El primero es isin. isin le permite seleccionar datos cuyo valor "está en" una lista de valores. Por ejemplo, así es como podemos usarlo para seleccionar vinos solo de Italia o Francia:
print("\n")
print(df.loc[df.country.isin(['Italy', 'France'])])

# El segundo es isnull (y su compañero notnull). Estos métodos le permiten resaltar valores que están (o no) vacíos (NaN). Por ejemplo, para filtrar vinos sin etiqueta de precio en el conjunto de datos, esto es lo que haríamos:
print("\n")
# print(df.loc[df.country.notnull()].to_string())
# print(df.loc[df.country.isnull()].to_string())


# Assigning data
# Going the other way, assigning data to a DataFrame is easy. You can assign either a constant value:

df['critic'] = 'everyone'
print(df)

df['index_backwards'] = range(len(df), 0, -1)
print("\n")
print(df)

print("\nPractica")

df["points-to-price"] = df.points / df.price

maxRelation = df.loc[df["points-to-price"].idxmax()]

print(df[df['description'].str.contains('tropical', case=False) | df['description'].str.contains('fruity',
                                                                                                 case=False)].shape[0])

"""
Nos gustaría publicar estas reseñas de vinos en nuestro sitio web, pero un sistema de calificación que oscila entre 80 y 100 puntos es demasiado difícil de entender; nos gustaría traducirlas en simples calificaciones de estrellas. Una puntuación de 95 o más cuenta como 3 estrellas, una puntuación de al menos 85 pero menos de 95 es 2 estrellas. Cualquier otra puntuación es 1 estrella.

Además, la Asociación Canadiense de Viñeros compró muchos anuncios en el sitio, por lo que cualquier vino de Canadá debería obtener automáticamente 3 estrellas, independientemente de los puntos.

Cree una serie star_ratings con la cantidad de estrellas correspondientes a cada reseña en el conjunto de datos.
"""


def asignar(row):
    if row['country'] == 'Canada':
        return 3  # Canadian wines automatically get 3 stars
    elif row['points'] >= 95:
        return 3
    elif row['points'] >= 85:
        return 2
    else:
        return 1



df['starRatings'] = df.apply(asignar, axis=1)

print(df.starRatings)


df['description'] = df['description'].str.lower()
dataTro = df['description'].str.count('tropical').sum()
dataFur = df['description'].str.count('fruity').sum()
descriptor_counts = pd.Series({'tropical': dataTro, 'fruity': dataFur})
print(descriptor_counts)