# Clase 20/09/2022
# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

cadena = input('INGRESE UNA CADENA DE TEXTO: ')
lista = []  # lista vacía
for i in cadena:
    if i not in lista:  # si el caracter aún no está en la lista, vamos a hacer lo siguiente:
        lista.append(i)  # lo agregamos a la lista
    print(f'\nlista de caracteres sin repetir ninguno: \n{lista}')
