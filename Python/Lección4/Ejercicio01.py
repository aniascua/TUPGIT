# Ejercicio 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostrar la lista
# con el bucle for, los elementos deben mostrarse de la siguiente forma:
# 1-2-3-4-5...  -50
lista = []
i = 0
while i <= 50:
    lista.append(i)
    i += 1

lista = list(range(1,50)) # Algoritmo eficaz, 5 lineas a una
for i in lista:
    print(i, end= '-')

# numero: int = 0
#
# while numero <= 50:
#     numero = numero + 1
#     print(numero-1)


