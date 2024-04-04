class Usuario:

    #atributos de clase
    userName = str()
    gmail = str()


user1 = Usuario()
"""
pasos que realiza pythin para verificar los atributos
    1.- verifica si nel atributo existe dentro del objeto
    2.- verifica si nel atributo existe dentro de la clase -> solo lectura 
    3.- lanza una excepcion
"""
print(user1.__dict__) #lista los