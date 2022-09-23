# Clase 20/09/2022
# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos. Crear un diccionario
# donde la clave sea el nombre del usuario y el valor sea el teléfono,
# el programa tendrá el siguiente menú de opciones:
#           1. Nuevo contacto
#           2. Borrar contacto
#           3. Ver contactos existentes
#           4. Salir

agenda = {}
while True:
    print('\t.:MENÚ:.')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('INGRESE UNA OPCIÓN DE MENÚ: '))
    if opcion == 1:
        nombre = input('INGRESE EL NOMBRE DEL CONTACTO: ')
        telefono = input('INGRESE EL NÚMERO DE TELÉFONO: ')
        if nombre not in agenda:
            agenda[nombre] = telefono
            print('CONTACTO AGREGADO EXITOSAMENTE!')
        else:
            print('ESTE NOMBRE DE CONTACTO YA EXISTE')
    elif opcion == 2:
        nombre = input('CUÁL ES EL NOMBRE DEL CONTACTO?: ')
        if nombre in agenda:
            del (agenda[nombre])
            print('SE HA ELIMINADO EL CONTACTO REQUERIDO')
        else:
            print('ESTE CONTACTO NO EXISTE EN LA AGENDA')
    elif opcion == 3:
        print('AGENDA DE CONTACTOS')
        for clave, valor in agenda.items():
            print(f'NOMBRE: {clave}, TELÉFONO: {valor}')
    elif opcion == 4:
        print('GRACIAS POR UTILIZAR SU AGENDA DE CONTACTOS')
        break
    else:
        print('SE EQUIVOCÓ DE OPCIÓN DE MENÚ')
    print()
