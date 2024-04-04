
import json

datas = ''
ID_PER = list(range(1, 11))
with open('data.json') as file:
    datas = json.load(file)

index = 0
for item in datas:
    ocupacion = 'La ocupacion es ' + item['nombre']
    print('INSERT INTO OCUPACION(ID_PER, NOMBRE, DESCRIPCION) VALUES({}{}{})'.format(index, item['nombre']), ocupacion)
    index += 1
