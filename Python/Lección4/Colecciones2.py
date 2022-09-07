# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no deben haber repetición)
# 1 Lista de palabras que aparecen en las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

lista1 = ["Ana", 10, 20, 22, "Ana", "Chocolate"]
lista2 = ["Pepe", 11, 21, 22, "Pepe", "Juan", "Chocolate"]

unirLista = lista1+lista2
unirLista = list(set(unirLista))
print(unirLista)