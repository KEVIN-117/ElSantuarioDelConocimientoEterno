from itertools import product

palabra1 = 'abcdefghijk'
palabra2 = 'lmnopqrstuv'
longitud = 20
ruta = r'F:\KEVIN_RODRIGUEZ\INGENIERIA_DE_SISTEMAS_KEVIN\SEMESTRE_II_2021\diccionario.txt'
combinaciones = [''.join(i) for i in product(palabra1 + palabra2, repeat=longitud)]

with open(ruta, 'w') as f:
    for combinacion in combinaciones:
        f.write(combinacion + '\n')