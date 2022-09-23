# Clase 13/09/2022
# Ejercicio 7: Juego adivinar un número. Para ello se debe realizar un juego para adivinar un número.
# Para ello se debe generar un número random entre 1-100 y luego ir pidiendo números indicando "es mayor", "es menor", según sea mayor o menor con respecto a N.
# El proceso termina cuando el usuario acierta, y allí se debe mostrar el número de intentos
import random

print('\t.: Juego de adivinar el número:.')
numeroRandom = random.randint(1, 5)  # Toma del 1 al 5, literal, recorre solo esos números
contador = 0

while True:
    numero = int(input('INGRESE UN NÚMERO: '))
    contador += 1
    if numero > numeroRandom:
        print('\tNo es el número. Intentá con un número menor a ese')
    elif numero < numeroRandom:
        print('\tNo es el número. Intentá con un número mayor a ese..')
    else:
        print(f'BINGO! {numeroRandom} es el número correcto')
        break  # Rompe el ciclo y el bucle

# numIngresado = (int(input('INGRESE UN NÚMERO: \n')))
#
# while numIngresado != numeroRandom:
#     numIngresado = (int(input('INGRESE UN NÚMERO: \n')))
#     if numIngresado < numeroRandom:
#         numIngresado = (int(input('INGRESE UN NÚMERO MAYOR: \n')))
#     elif numIngresado > numeroRandom:
#         numIngresado = (int(input('INGRESE UN NÚMERO MENOR: \n')))
#     else:
#         print('BINGO! ADIVINASTE EL NÚMERO ')
#     contador = contador + 1
# print(f'NÚMERO DE INTENTOS REALIZADOS: ', contador)
