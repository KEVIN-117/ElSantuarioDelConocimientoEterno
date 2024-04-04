class Nodo:
   def __init__(self, x):
      self.valor = x
      self.siguiente = None


def hasCycle(cabeza: Nodo) -> bool:
   # Tu código aquí 👇
   if not cabeza:
       return False

   current: Nodo = cabeza
   faztPointer: Nodo = cabeza
   slowPointer: Nodo = cabeza
   while faztPointer.siguiente and faztPointer.siguiente.siguiente:
       if slowPointer == faztPointer.siguiente.siguiente or slowPointer == faztPointer.siguiente:
           return True
       faztPointer = faztPointer.siguiente.siguiente
       slowPointer = slowPointer.siguiente
   return False

nodo1 = Nodo(1)
nodo2 = Nodo(2)
nodo3 = Nodo(3)
nodo4 = Nodo(4)
nodo1.siguiente = nodo2
nodo2.siguiente = nodo3
nodo3.siguiente = nodo4
# nodo4.siguiente = nodo2

response = hasCycle(nodo1)
print(response)

nodo1 = Nodo(1)
nodo2 = Nodo(2)
nodo3 = Nodo(3)
nodo4 = Nodo(4)
nodo1.siguiente = nodo2
nodo2.siguiente = nodo3
nodo3.siguiente = nodo4
nodo4.siguiente = nodo2

response = hasCycle(nodo1)

print(response)

