# Clase 27/9/2022
# Ejercicio 3: Función recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor de 5,
# debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1:  # Caso base
        print(numero)
        imprimir_numeros_recursivos(numero - 1)  # que vaya restando
    elif numero == 0:
        return
    elif numero <= 0:
        print('Valor ingresado incorrecto...')


numero = int(input('INGRESE UN NÚMERO: '))
print(f'{numero}, {imprimir_numeros_recursivos(numero)}')

# fuera del if y de la función:
# imprimir_numeros_recursivos(1)  # Caso recursivo
