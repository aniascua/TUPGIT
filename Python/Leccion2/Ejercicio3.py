# CLASE 7 - 1/06 - HOY NO HAY VIDEOCLASE. SÓLO EJERCICIOS

# EJERCICIO 3

# Pedir al usuario que ingrese un mes del año, el valor valor debe ser entre 1 y 12,
# luego le decimos en qué estación del año está:

# PRIMAVERA 21/09 AL 21/12
# VERANO 21/12 AL 21/03
# OTOÑO 21/03 AL 21/06
# INVIERNO 21/06 AL 21/09

# En el ejercicio utilizo None: esto indica que la variable aún no tiene asignado un
# valor(está vacía), luego lo voy a ampliar
# Este None es equivalente a null en otros lenguajes de programación como Java.


mesIngresado = None

mesIngresado = int(input(f'INGRESE UN MES COMPRENDIDO ENTRE LOS NÚMEROS 1 Y 12: '))

if mesIngresado == 1 or mesIngresado == 2 or mesIngresado == 3:
    print(f'ESTAMOS EN VERANO')
elif mesIngresado == 4 or mesIngresado == 5 or mesIngresado == 6:
    print(f'ESTAMOS EN OTOÑO')
elif mesIngresado == 7 or mesIngresado == 8 or mesIngresado == 9:
    print(f'ESTAMOS EN INVIERNO')
elif mesIngresado == 10 or mesIngresado == 11 or mesIngresado == 12:
    print(f'ESTAMOS EN PRIMAVERA')
'''
'''
# EJERCICIO 4: ETAPAS DE VIDA
# Haremos un programa que cuando el user ingrese su edad, le diga o imprima en pantalla la etapa de su vida en una breve oración:
# 0 a 10 = La infancia es incríble y bella
# 10 a 19 = Tienes muchos cambios, mucho que estudiar
# 20 a 29 = Amor y comienza el trabajo
# 30 a 39 = Ya estás viejo

edad = int(input(f'INGRESE SU EDAD... VOY A DECIRTE EN QUE ETAPA DE LA VIDA ESTÁS!:  '))

if edad >= 0 and edad <= 10:
    print(f'La infancia es increíble y bella')
elif edad >= 10 and edad <= 19:
    print(f'Tienes muchos cambios, mucho que estudiar')
elif edad >= 20 and edad <= 29:
    print(f'Amor y comienza el trabajo')
elif edad >= 30 and edad <= 39:
    print(f'Ya estás viejo')
else:
    print(f'Sos un dinosaurio!')
'''

# EJERCICIO 5: SISTEMA DE CALIFICACIONES
# El objetivo del programa será creat un sistema de calificaciones de la siguiente manera: Le pedimos al usuario que ingrese un valor del 0 al 10

# Luego si ingreso 9 o 10, imprimimos A
# Entre 8 y menor a 9, imprimimos B
# Entre 7 y menor a 8, imprimimos C
# Entre 6 y menor a 7, imprimimos D
# Entre 0 y menor a 6, imprimimos F
# De lo contrario, el valor ingresado es incorrecto

calificacion = int(input(f'INGRESE SU CALIFICACIÓN: '))

if calificacion == 10 or calificacion == 9:
    print('nota: A')
if calificacion == 8:
    print('nota: B')
if calificacion == 7:
    print('nota: C')
if calificacion == 6:
    print('nota: D')
if calificacion >= 0 and calificacion <= 5:
    print('nota: F')
else:
    print(f'La nota ingresada es inválida, ingrese números del 0 al 10')
''''''