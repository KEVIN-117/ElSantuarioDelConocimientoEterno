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
