def solution(a):
    """
    El "extended unpacking" en Python se refiere al uso del operador `*` en diferentes contextos para desempaquetar valores en una secuencia (como una lista o tupla) o en un diccionario.
    Este operador facilita la manipulación de datos al permitir extraer elementos específicos de una secuencia o asignar valores a variables de manera más flexible. Aquí te doy una
    explicación más detallada de cómo funciona en diferentes situaciones:
    ### Desempaquetado de Secuencias (Listas, Tuplas):

    1. **Desempaquetado en Asignación:**
       - Puedes usar el operador `*` para desempaquetar los elementos de una lista o tupla en variables individuales.
         ```python
             values = [1, 2, 3, 4, 5]
             first, *rest, last = values
             print(first)  # Output: 1
             print(rest)   # Output: [2, 3, 4]
             print(last)   # Output: 5
         ```
       - En este ejemplo, `first` recibe el primer elemento, `last` recibe el último elemento, y `rest` recibe el resto de los elementos en una lista.

    2. **Desempaquetado en Funciones:**
       - Puedes usar `*` en la llamada a una función para desempaquetar los elementos de una lista o tupla como argumentos de la función.
         ```python
             values = [1, 2, 3]
             result = sum(*values)
             print(result)  # Output: 6
         ```
       - En este caso, `sum(*values)` es equivalente a `sum(1, 2, 3)`.

    ### Desempaquetado de Diccionarios:

    1. **Desempaquetado en Asignación de Diccionarios:**
       - Puedes usar el operador `**` para desempaquetar los elementos de un diccionario en variables individuales.
         ```python
             info = {'name': 'John', 'age': 25, 'city': 'New York'}
             name, **details = info
             print(name)
             # Output: name
             print(details) #
             Output: {'age': 25, 'city': 'New York'}
         ```
       - En este ejemplo, `name` recibe la primera clave, y `details` recibe el resto de las claves y valores en un diccionario.

    2. **Desempaquetado en Funciones:**
       - También puedes usar `**` en la llamada a una función para desempaquetar los elementos de un diccionario como argumentos de la función.
         ```python
         info = {'name': 'John', 'age': 25}
         greet(**info)
         ```
       - En este caso, `greet(**info)` es equivalente a `greet(name='John', age=25)`.
    :param a:
    :return:
    """
    res = a[:]
    while res and res[0] != res[-1]:
        first, *res, last = res
        print(*res)
    return res


solution([3, 4, 2, 4, 38, 4, 5, 3, 2])