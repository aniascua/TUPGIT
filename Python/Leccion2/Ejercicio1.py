'''
Ejercicio 1: Escribir la siguiente expresión en forma de expresión algorítmica
# A3 x (b2 - 2ac) / 2b (sobre 2b)
# 1. Pedimos al usuario 3 valores: a, b, c
# 2. Mostramos el resultado en pantalla
'''

a = float(input('INGRESE EL VALOR DE a: '))
b = float(input('INGRESE EL VALOR DE b: '))
c = float(input('INGRESE EL VALOR DE c: '))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
# a ** 3 ( A al cubo)         b ** 2 ( B al cuadrado)      con un solo *, multiplica

print(f'EL RESULTADO ES: {resultado}')
