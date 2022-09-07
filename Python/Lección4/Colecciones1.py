# Ejercicio 1: Eliminar duplicados de una lista
# Escribe un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por último, mostrar la lista.

# Creamos una lista (2 maneras, 1 simplificada)
lista = [1,2,3, "Ana", 2,2,3,"Alberto",3,"Ana"]
# conjunto = set(lista) # Convertimos la lista a un conjunto tipo SET
# lista = list(conjunto) # Convertimos el conjunto a una lista
# print(lista) # Muestra todo menos los duplicados

# Lo mismo pero en 1 sola línea de código (eficiencia)
lista = list(set(lista)) # De esta forma muetra la lista exactamente como está
print(lista)

