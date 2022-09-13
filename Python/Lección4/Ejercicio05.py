# Clase 13/09/2022
# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un Número positivo

numero = int(input('INGRESE UN NÚMERO: '))

while numero < 0: # Mientras el Número sea negativo
    print('ERROR -> El número tiene que ser positivo')
    numero = int(input('INGRESE UN NÚMERO: '))

factorial = 1 # La variable para calcular el factorial

for i in range(1,numero+1): # le sumamos 1 para que abarque el número en su totalidad
    factorial *= i
print(f'\nEL FACTORIAL DEL NÚMERO {numero} POSITIVO INGRESADO ES: {factorial}')