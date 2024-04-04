from sympy import Symbol, Derivative

x = Symbol('x')  # creacion de la variable simbolica
function = x ** 2  # funcion a derivar

# derivamos y obtenemos el resultado simbolico
derivative = Derivative(function, x)
result = derivative.doit()
print(result)

# para obtener el resultado evaluamos la derivada en un punto
point = 2
result.subs(x, point)
print(result)
