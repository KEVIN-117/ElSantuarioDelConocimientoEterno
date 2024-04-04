import pandas as pd

# Crear un DataFrame de ejemplo
data = {'Edad': [25, 30, 35, 40, 45],
        'Grupo': ['18-35', '18-35', '36-60', '36-60', '36-60']}
df = pd.DataFrame(data)

# Definir un diccionario de mapeo de grupos de edad
mapeo = {'18-35': 'Joven', '36-60': 'Adulto'}
print(df)
# Aplicar el mapeo a la columna 'Grupo' utilizando map
df['Grupo'] = df['Grupo'].map(mapeo)
print(df.describe(include='all'))
print(df.Edad.mean())
