# Clase 13/09/2022
# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
#                                                Suma de números pares del 2 al 30
#                                                Suma = 240


a = int(input('INGRESE DESDE DONDE VA A COMENZAR LA SUMA: '))
b = int(input("AHORA INGRESE HASTA DONDE QUIERE LLEGAR A SUMAR: "))
suma = 0

for i in range(a,b+1):
    if i % 2 == 0:   # Si el número es Par, entonces
        suma += i
print(f'\nLA SUMA DE LOS PARES DENTRO DEL RANGO, ES: ',suma)


