# Clase 13/09/2022
# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde en una lista su tabla de multiplicar hasta el 10.
# Por ejemplo: Si digita el 5, la lista tendrá: 5,10,15,20,25,30,35,40,45,50

print('\nBIENVENIDO A LA TABLA DE MULTIPLICAR')
numero = int(input('\nINGRESE UN NÚMERO: \n'))
# for i in range(0, 11): # Del 1 al 10
#     resultado = i * numero
#     print(numero, "x", i, "=", resultado)

lista = []
contador = 1
print(f'LA TABLA DEL {numero} ES: ')
while contador <= 10:
    resultado = contador * numero
    contador = contador + 1  # Le sumo 1 cada vez para llegar al límite que es 10
    lista.append(resultado)
    #lista.append(f'{contador}' 'x' f'{contador}' '=' f'{resultado}')
    print(lista)