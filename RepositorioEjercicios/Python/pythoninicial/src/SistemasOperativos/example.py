import os
import pandas as pd
import matplotlib.pyplot as plt

task = list(map(lambda x: x.strip(), str(os.popen("tasklist /fo csv").read()).split("\n")[3:]))

Image_Name = []
PID = []
Session_Name = []
Session = []
Mem_Usage = []
for i in task:
    aux = i.split("\",\"")
    auxList = []
    for j in range(len(aux)):
        if j == 0:
            Image_Name.append(aux[j].replace('"', ''))
        elif j == 1:
            PID.append(aux[j])
        elif j == 2:
            Session_Name.append(aux[j])
        elif j == 3:
            Session.append(aux[j])
        elif j == 4:
            Mem_Usage.append(aux[j].replace('"', ''))

pd.options.display.max_rows = len(task)
data = {
    "Image Name": Image_Name[:len(Image_Name)-1],
    "PID": PID,
    "Session Name": Session_Name,
    "Session": Session,
    "Mem_Usage": Mem_Usage
}
df = pd.DataFrame(data)

newDf = df.filter(['PID', 'Image Name'])
print(newDf)

dataName = df.query(f"PID == '{int(input())}'")['Image Name'].values[0]
print(dataName)


# Lista de películas
peliculas = ['El Padrino', 'El Padrino II', 'El Padrino III', 'La Lista de Schindler', 'Forrest Gump',
             'El Club de la Pelea', 'El Señor de los Anillos', 'El Curioso Caso de Benjamin Button']

while True:
    # Pide al usuario que ingrese su consulta de búsqueda
    consulta = input('Ingrese su búsqueda: ')

    # Salir del bucle si el usuario ingresa "exit"
    if consulta == 'exit':
        break


    # Define una función que pueda comparar la consulta del usuario con las opciones de búsqueda y devolver las opciones más relevantes
    def buscar_pelicula(consulta, peliculas):
        resultados = []
        for pelicula in peliculas:
            if consulta.lower() in pelicula.lower():
                resultados.append(pelicula)
        return resultados


    # Llama a la función de búsqueda con la consulta del usuario y muestra los resultados
    resultados = buscar_pelicula(consulta, peliculas)
    if resultados:
        print('Resultados:')
        for resultado in resultados:
            print(resultado)
    else:
        print('Lo siento, no se encontraron resultados para su búsqueda.')

