import math # Importamos la clase math para hacer uso de la función SQRT(raíz cuadrada)
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
# Crear una lista que solo incluya los números menores a 5
# e imprima por consola [1, 3, 2]

lista = [] # Definimos la lista
# Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Ejercicio de matemáticas
# Para sacar la raíz cuadrada de un número positivo
numero = int(input('INGRESE UN NÚMERO POSITIVO: '))
while numero < 0:
    print('ERROR -> debería ser un N° positivo')
    numero = int(input('INGRESE UN NÚMERO POSITIVO: '))
print(f'\nSU RAÍZ CUADRADA ES: {math.sqrt(numero):.2f}')