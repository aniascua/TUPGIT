# Ejercicio 2: Modificar los elementos de una lista
# LLenar una lista con los números del 1 al 10, luego modificar los elementos
# de la lista multiplicándolos por un valor ingresado x el usuario

lista = list(range(1,11))
print('Lista Original')
for i in lista:
    print(i, end='-')
valor = int(input('\nINGRESE UN VALOR A MULTIPLICAR: '))

# Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista): # Función para modificar los índices de la lista
    lista[indice] *= valor # El iterador solo recorre los índices, en esta línea se multiplica
print(f'Lista final con los elementos multiplicados por {valor}')
for i in lista:
    print(i, end= '-')
