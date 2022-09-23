# Clase 13/09/2022
# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# Inicial de $1000 y tendrá el siguiente menú de opciones:
#               1. Ingresar dinro en la cuenta
#               2. Retirar dinero de la cuenta
#               3. Mostrar dinero disponible
#               4. Salir

saldo = 1000
while True:
    print('\t.:MENÚ:.')
    print('1. Ingresar dinero en la cuenta')
    print('2. Retirar dinero en la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    opcion = int(input('INGRESE UNA OPCIÓN DE MENÚ: '))
    print()
    if opcion == 1:
        extra = float(input('CUÁNTO DINERO DESEA INGRESAR?: -> $'))
        saldo += extra
        print(f'DINERO EN LA CUENTA AL MOMENTO: ${saldo}')
    elif opcion == 2:
        retirar = float(int(input('CUÁNTO DINERO DESEA RETIRAR -> $')))
        if retirar > saldo:
            print('NO TIENE ESA CANTIDAD DE DINERO')
        else:
            saldo -= retirar
            print(f'DINERO EN LA CUENTA AL MOMENTO: ${saldo}')
    elif opcion == 3:
        print(f'DINERO EN LA CUENTA AL MOMENTO: ${saldo}')
    elif opcion == 4:
        print('GRACIAS POR UTILIZAR SU CAJERO AUTOMÁTICO, HASTA PRONTO.')
        break
    else:
        print('ERROR, SE EQUIVOCÓ DE OPCIÓN DE MENÚ.')
        print()
