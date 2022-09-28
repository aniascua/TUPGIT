# Clase 13/09/2022
# Comenzamos con FUNCIONES

# mi_funcion() # No se puede llamar antes de definir a una función

# Definimos una función
def mi_funcion():  # Para identificar la función utilizamos paréntesis
    print('Saludos a todos los alumnos de la Tecnicatura')
    print('Hola mundo')


mi_funcion()  # Estamos llamando a la función
mi_funcion()  # Se puede llamar a una función N cantidad de veces


# Clase 20/09/2022 - LISTAS, UNPACKING Y MÁS

# Desempaquetado de una lista o list Unpacking
def show(name, lastName):
    print(name + ' ' + lastName)


person = ["Ana", "Ascua"]
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Osvaldo", "Giordanini")  # desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"}  # desempaquetamos mediante Diccionario
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:
        break  # esta es la única manera para que no se muestre el Else
else:
    print('Lista terminada')

# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P']  # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Argentina"},
           {"name": "Stella", "country": "Belgium"},
           {"name": "Corona", "country": "México", }
           ]

Arg = [b for b in bottleC if b["country"] == "Argentina"]  # Extraemos solo lo que queremos del diccionario
print(Arg)
print(bottleC)  # Acá extraemos TODO del diccionario.


# Paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print('Saludos a todos los que ven a través del canal de Youtube')
    print(f'Nombre: {name}, Apellido: {lastName}')


mi_funcion2('Ana', 'Ascua')
mi_funcion2('Ariel', 'Betancud')
mi_funcion2('Analia', 'Lalia')


# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b


resultado = sumar(78, 22)
# print(f'EL RESULTADO DE LA SUMA ES: {resultado}')
print(f'EL RESULTADO DE LA SUMA ES: {sumar(55, 45)}')


# VALORES POR DEFAULT
def sumar2(a=0, b=0):  # Le damos un valor por default para evitar errores
    return a + b


resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')


# Argumentos, variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza: *args (todos los argumentos)
    for nombre in nombres:
        print(nombre)  # se convierte en todos los nombres, se convierte en una tupla


listarNombres('Ana', 'Luca', 'Jose', 'Claudia', 'Maria')
listarNombres('Marcos', 'Daniel', 'Romina', 'Pepe', 'Carlos')  # Estos nombres se seguirán añadiendo a la lista anterior


# Clase 27/09/2022
def listarTerminos(nombre, *nombres, **terminos):  # nombre=arg fijo, *nombres = tupla, **argumentos = para diccionarios
    for llave, valor in terminos.items():  # kwargs signicia: key-word argument
        print(f'{llave} : {valor}')


# listarTerminos()  # No recibe nada, nada se va a mostrar
# listarTerminos(IDE='Integrated Development Environment', PK='Primary Key')
# vamos a ver si le podemos ingresar otro tipo de datos:
# listarTerminos(Nombre='Leo Messi')


# Lista para recibir elementos:
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)


nombres2 = ['Tito', 'Pedro', 'Carlos']  # lista con 3 nombres
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10, 11)  # No es un objeto iterable
desplegarNombres(
    (10, 11))  # si pongo 2 paréntesis, se convierte en TUPLA iterable. En un solo elemento, no olvidar la coma
# y al ser una tupla iterable, va a mostrar los números 10 y 11
desplegarNombres([22, 55])  # La convertimos en una lista


# Funciones Recursivas
def factorial(numero):
    if numero == 1:  # Caso base
        return 1
    else:
        return numero * factorial(numero - 1)  # Caso recursivo


# resultado = factorial(5)  # Lo hacemos en código duro
# print(f'El factorial del número 5 es: {resultado}')

numero = int(input('INGRESE UN NÚMERO, TE DIRÉ SU FACTORIAL: '))
print(f'EL FACTORIAL DEL NÚMERO {numero}, ES: {factorial(numero)}')
