import math

'''
Ejercicio 1: Escribir la siguiente expresión en forma de expresión algorítmica
# A3 x (b2 - 2ac) / 2b (sobre 2b)
# 1. Pedimos al usuario 3 valores: a, b, c
# 2. Mostramos el resultado en pantalla
'''
'''
a = float(input('INGRESE EL VALOR DE a: '))
b = float(input('INGRESE EL VALOR DE b: '))
c = float(input('INGRESE EL VALOR DE c: '))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
# a ** 3 ( A al cubo)         b ** 2 ( B al cuadrado)      con un solo *, multiplica

print(f'EL RESULTADO ES: {resultado}')
'''

'''
# EJERCICIOS EXTRA DEL PDF CLASE 6 PYTHON:

# Área de un rectángulo base * altura
area = 0;
base = (int(input(f'INGRESE LA BASE: ')))
altura = (int(input(f'INGRESE LA ALTURA: ')))
area = base * altura
print(f'EL RESULTADO DE BASE * ALTURA EN CENTÍMETROS, ES: {area}')
'''

'''
# Área y longitud de un círculo
area = 0
radio = 0
pi = 3.1415
longitud = 0

print(f'\nEste programa calcula el área y longitud de un círculo.\n')
radio = (int(input(f'INGRESE EL RADIO DEL CÍRCULO: ')))

# HACEMOS EL CÁLCULO PARA OBTENER ÁREA Y LONGITUD DEL CÍRCULO
# FÓRMULA: ÁREA = Pi * r2
#          LONGITUD = 2 * Pi * radio

area = pi * radio**2
longitud = 2 * pi * radio
print(f'El área del círculo es {area} y su longitud es: {longitud}')
'''

'''

# INTERCAMBIO DE VALOR DE 2 VARIABLES
a = 10
b = 5
print(f'\nVARIABLE A: {a} Y VARIABLE B: {b}\n')
print(f'AHORA VAMOS A INVERTIR SUS VALORES...')

a = 5
b = 10
print(f'\nVARIABLE A: {a} Y VARIABLE B: {b}\n')
'''


'''
FÓRMULAS QUE SIRVEN: 

# a ** 3 ( A al cubo)         b ** 2 ( B al cuadrado)      con un solo *, multiplica
'''

'''
# SOLUCIÓN LÓGICA DE LA SIGUIENTE OPERACIÓN

a = float(input(f'INGRESE EL VALOR DE A: '))
b = float(input(f'INGRESE EL VALOR DE B: '))

resultado = ((3 + 5 * 8 ) < 3 and ((- 6/3 * 4 ) + 2 < 2)) or ( a > b)

# ESTO NOS DEVUELVE UN RESULTADO TRUE OR FALSE.
# EL CONDICIONAL OR, DICE QUE SI UNA DE LAS 2 CONDICIONES SE CUMPLE, TODO ES VERDADERO.
# MIENTRAS QUE EL CONDICIONAL AND, NECESITA QUE AMBAS CONDICIONES SE CUMPLAN PARA SER TRUE.

print(f'{resultado}')
'''



