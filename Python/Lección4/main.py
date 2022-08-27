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

# Tipo SET
planetas = {'Marte', 'Júpiter', 'Venus'}
print(planetas)  # los planetas se muestran en orden aleatorio
print(len(planetas))  # usamos la función len = lenght (longitud)

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
#print(lista3.index(0)) # nos da error porque 0 no figura en la lista

# Cómo saber cuántos valores repetidos hay dentro de una lista
print(lista3.count(1))

# Para poner al revés una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1,2,3] * 2
print(lista)

lista3 = lista3 * 2
#print(lista3)

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
