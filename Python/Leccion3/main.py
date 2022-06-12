# CICLO WHILE (MIENTRAS o DURANTE)   Clase 8-06

# esto es un búcle infinito:

# condicion = True
# while condicion:
#     print(f'Ejecutamos el ciclo while')
# else:
#     print('Fin del ciclo while')


# esto es un búcle que sí tiene final:

# contador = 0
# while contador < 78:
#     print('Ejecutamos nuestro ciclo whiile ', +contador)
#     contador += 1  # si no le pongo esto, el búcle sería infinito
# else:
#     print('Fin del ciclo while')



# PROGRAMA QUE MUESTRE 5 NÚMEROS EN PANTALLA USANDO BUCLE WHILE

# # IMPRIMIR NÚMEROS DEL 0 AL 5 CON EL CICLO WHILE:
# maximo = 5
# contador = 0
#
# while contador <= maximo:
#     print(f'N°: {contador}')
#     contador += 1  # esto le pone fin al búcle
# else:
#     print(f'Fin del programa, ya mostramos los 5 numeros de manera ascendente')



# PROGRAMA QUE IMPRIME DEL 1 AL 5 DE MANERA DESCENDENTE:

# minimo = 1
# contador = 5
#
# while minimo <= contador:
#     print(f'N°: {contador}')
#     contador -= 1
# else:
#     print(f'Fin del programa, ya mostramos los 5 numeros de manera descendente')


# # CICLO FOR (PARA, HASTA, CON PASO, HACER)
# # EL CICLO FOR ITERA UNA LISTA DE DATOS O ELEMENTOS:
#
# # en otros lenguajes, al ciclo for se lo conoce como foreach: por cada elemento
#
# cadena = 'Hello'
# for letra in cadena:   # letra por letra en cadena
#     print(letra)   # muestra una letra por línea
# else:
#     print('Fin del ciclo For')




# PALABRA RESERVADA 'BREAK' ROMPER DETENER
# for letra in 'Alemania':
#     if letra == 'a':
#         print(f'Letra encontrada: {letra}')
#         break  # esto rompe el ciclo y con que encuentre 1 sola letra A, detiene el ciclo
# else:
#     print(f'Fin del ciclo for')



# PALABRA RESERVADA 'CONTINUE'

# EJERCICIO QUE IMPRIMA LOS NÚMEROS PARES DENTRO DE UN RANGO DE DATOS:
# for i in range(6):
#     if i % 2 == 0:
#         print(f'N°: {i}')

# Lo mismo que arriba pero utilizando la palabra reservada CONTINUE:
for i in range(6):
    if i % 2 != 0:  # cuando I sea par
        continue
    print(f'N°: {i}')

