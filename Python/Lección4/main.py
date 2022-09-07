# 1ra clase 2do cuatrimestre - Clase 16/08/2022
# COLECCIONES EN PYTHON (added on 27/08)
# lista = Ariel, Liliana, Natalia, Osvaldo
# Las listas son conocidas como arrays o vectores (added on 27/08)
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print('Este es el primer nombre: ' + nombres[0])
print('Este es el segundo nombre: ' + nombres[1])
# mostrar nombres de manera inversa: 2 formas:
print(nombres[3])
print(nombres[-1])  # este funciona igual que el de arriba pero recorre la lista de manera inversa
print(nombres[-2])  # este muestra a Lily

# Recuperar un rango de la lista:
print(nombres[0:2])  # el 2do num indica que va a recorrer esa cantidad de índices
# solo muestra los índices 0 y 1, pero no los siguientes

# Ir del inicio de la lista hacia el indice (sin incluirlo)
print(nombres[:3])  # nos muestra hasta la posicion 2, no la 3.
# el compilador entiende solo que si no ponemos nada delante, arranca desde el índice 0

# Desde el índice indicado hasta el final:
print(nombres[1:])

# Modificamos un valor dentro de una lista:
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

# Iterar nuestra lista:
for nombre in nombres:  # nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuántos elementos tiene una lista:
print(len(nombres))  # le pasamos como parámetro la lista Nombres

# Agregamos un elemento a la lista: (se agrega al final de esta)
nombres.append('Ana')
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4,5])
nombres.append(7)
print(nombres)

# Insertar un elemento en un índice específico:
nombres.insert(1, 'Ana')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminamos un elemento
# nombres.remove('Ana')
# print(nombres)
# nombres.remove('Ana')
# print(nombres) # Remueve 2 veces el nombre Ana de la lista

# Eliminar el último elemento de la lista
nombres.pop()
print(nombres)

# Eliminar un índice específico:
del nombres[3]  # delete
print(nombres)

# Eliminar, borrar o limpiar todos los elementos:
nombres.clear()
print(nombres)  # muestra la lista vacía

# Eliminar la lista
del nombres
# print(nombres) # no imprime nada porque se borró la lista

# Tuplas: son inmutables, es decir, no se pueden modificar
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))  # largo de una tupla en números

# Acceder a un elemento, para esto utilizamos corchetes, no paréntesis
print(cocina[0])
# mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])  # muestra 2 elementos

# Ejemplo de tupla
verduras = ('papas',)  # en una tupla no debe faltar la coma, aunque haya 1 solo item
print(verduras)

# Recorremos los elementos de la tupla
for cocinar in cocina:  # Print está usando \n backslash n para saltos de líneas
    print(cocinar, end=' ')  # Usamos end= para eliminar los saltos de línea

# Conversión de tupla a lista e inverso
cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina # esto es para eliminar la tupla. del=delete (eliminar)


# Colección de tipo SET - Clase 23/08/2022

# En set, no mantiene ningún índice. El orden es aleatorio.
# Un elemento de tipo set es una colección sin orden y sin índices

# Tipo SET  -  Ascua Ana
planetas = {'Marte', 'Júpiter', 'Venus'}
print(planetas)  # los planetas se muestran en orden aleatorio
print(len(planetas))  # usamos la función len = length (longitud)

# Revisar si un elemento existe dentro del set
print('Iguana' in planetas)  # Iguana, está en planetas? No, false.
print('Iguana' not in planetas) # Iguana NO está en planetas: true

# Agregar un elemento
planetas.add('Tierra')  # add es una función. add = agregar
planetas.add('Tierra')
planetas.add('Tierra')
planetas.add('Tierras') # Este si lo va a agregar porque es diferente
print(planetas) # va a agregar la palabra TIERRA al Set Planetas

# La colección de tipo SET, nos sirve para evitar elementos duplicados en una lista de datos.
# Hay datos que no se pueden duplicar como el DNI o una patente de auto


# Eliminar elementos, puede arrojar un error si el elemento NO existe:
planetas.remove('Júpiter')  # Si escribo Júpiter sin acento, no funciona
print(planetas)
planetas.discard('Tierras') # Esta función no nos presenta errores aunque ingresemos mal el nombre del elemento
print(planetas)

# Limpiar SET
planetas.clear()
#print(planetas)

# Eliminar el SET o conjunto de elementos
del planetas
#print(planetas) # no muestra nada porque se eliminó el Set


# DICCIONARIOS EN PYTHON
# 'Messi': 10 - un diccionario está compuesto por 2 elementos
# lado izq: Una llave y lado der: Un valor
# dict(key,value)
diccionario = {
    'IDE':'Integrated Development Environment',
    'MESSI':'Jugador de fútbol',
    'POO':'Programación Orientada a Objetos',
    'SABD':'Sistema de Administración de Bases de Datos'
}
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario['MESSI']) # Nos dice el valor de esa llave

# otra forma de recuperar un elemento
print(diccionario.get('POO')) # Nos da el valor de POO
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función ITEMS para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor) # muestra las llaves y sus valores

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # muestra solo las llaves


for valor in diccionario.values(): # usamos una función para acceder al valor
    print(valor) # muestra solo los valores


# Comprobar la existencia de algún elemento
print('IDE' in diccionario) # devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario # El diccionario se borró


# Concatenamos listas
lista1 = [1,2,3,1,1]
lista2 = [4,5,6]
lista3 = lista1+lista2 # concatenamos
print(lista3)

lista3.extend([7,8,9]) # función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # función para ubicar en qué índice está el valor ingresado
# print(lista3.index(0)) # nos da error porque 0 no figura en la lista

# Cómo saber cuántos valores repetidos hay dentro de una lista
print(lista3.count(1))

# Para poner al revés una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1,2,3] * 2
print(lista)

lista3 = lista3 * 2
# print(lista3)

# Métodos de ordenamiento, en Python es una función
lista.sort()
print(lista) # ascendente
lista.sort(reverse=True)
print(lista) # descendente


# Repaso de tuplas, listas inmutables, no se pueden modificar
tupla = (4, 'Hola', 6.78, [1,2,78], 4, 'Hola') # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es 1 o 0
# Lo que podemos usar dentro de tuplas son: index, count, length
# En tuplas se puede convertir de tupla a lista y de lista a tupla

# Clase 30/08/2022
# REPASO DE SET O CONJUNTO PARA DEFINIR UN CONJUNTO
conjunto2 = set()
conjunto1 = {'bye',}
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1) # Preguntamos si el número 3 NO está en conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) # Nos devuelve un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 # La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # Que elemento tienen en común
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que está en el conjunto1 y no el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # Elementos que no son compartidos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) # Acá preguntamos si un conjunto es subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) # preguntamos si elementos del conjunto1 están dentro del 3
print(conjunto3.issuperset(conjunto2)) # Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Cómo saber si los conjuntos son
# disconexos = no comparten ningún elemento
print(conjunto1.isdisjoint(conjunto2)) # no hay cosas en común entre los 2 conjuntos

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset # Congela al conjunto, lo hace inmutable, inalterable
# No se puede agregar, modificar, ni eliminar elementos del conjunto

# Repaso de Diccionarios
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red','Verde':'Green','Amarillo':'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ana': {'edad': 26, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Leo Messi', 'Edad': 35, 'Altura': '1.70', 'Precio': '50m', 'Posicion': 'izquierda'},
    22: {'Nombre': 'Pepito', 'Edad': 22, 'Altura': '1.67', 'Precio': '55m', 'Posicion': 'derecha'},
    11: {'Nombre': 'Batman', 'Edad': 40, 'Altura': '1.80', 'Precio': '100m', 'Posicion': 'defensor'},
    19: {'Nombre': 'Robin', 'Edad': 35, 'Altura': '1.67', 'Precio': '99m', 'Posicion': 'delantero'},
    17: {'Nombre': 'Godzilla', 'Edad': 200, 'Altura': '300', 'Precio': '10000m', 'Posicion': 'derecha'},
    21: {'Nombre': 'Pato Donald', 'Edad': 20, 'Altura': '1.20', 'Precio': '200m', 'Posicion': 'volante'},
    9: {'Nombre': 'Bob Patiño', 'Edad': 38, 'Altura': '1.90', 'Precio': '10m', 'Posicion': 'derecha árbol de Bart'},
    5: {'Nombre': 'Flanders', 'Edad': 45, 'Altura': '1.75', 'Precio': '20m', 'Posicion': 'vecino de Homero'},
    8: {'Nombre': 'Lisa', 'Edad': 11, 'Altura': '1.20', 'Precio': '100m', 'Posicion': 'hermana de Bart'}
}
print('Tenemos cargados en el diccionario la cantidad de jugadores: ',end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop() # Quita el último elemento y lo guarda en la variable
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora quedó así: {pila}')

# Colas con listas
# Estructura de datos de tipo FiFo (First input/ First output)
cola = ['Ana', 'Liliana', 'Jack', 'Homero']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Lisa')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el último cliente: {seRetira}')
print(cola)

# Seguimos mostrando como recorrer un diccionario con el ciclo FOR
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')