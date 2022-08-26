# 1ra clase 2do cuatrimestre - Clase 16/08/2022

# lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ['Naty','Osvaldo','Lily','Ariel']
print(nombres)
print('Este es el primer nombre: '+nombres[0])
print('Este es el segundo nombre: '+nombres[1])
# mostrar nombres de manera inversa: 2 formas:
print(nombres[3])
print(nombres[-1]) # este funciona igual que el de arriba pero recorre la lista de manera inversa
print(nombres[-2]) # este muestra a Lily

# Recuperar un rango de la lista:
print(nombres[0:2]) # el 2do num indica que va a recorrer esa cantidad de índices
# solo muestra los índices 0 y 1, pero no los siguientes

# Ir del inicio de la lista hacia el indice (sin incluirlo)
print(nombres[ :3]) # nos muestra hasta la posicion 2, no la 3.
# el compilador entiende solo que si no ponemos nada delante, arranca desde el índice 0

# Desde el índice indicado hasta el final:
print(nombres[1: ])

# Modificamos un valor dentro de una lista:
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

# Iterar nuestra lista:
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuántos elementos tiene una lista:
print(len(nombres)) # le pasamos como parámetro la lista Nombres

# Agregamos un elemento a la lista: (se agrega al final de esta)
nombres.append('Ana')
print(nombres)

# Insertar un elemento en un índice específico:
nombres.insert(1,'Ana')
print(nombres)
nombres.insert(3,'Debora')
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
del nombres[3] # delete
print(nombres)

# Eliminar, borrar o limpiar todos los elementos:
nombres.clear()
print(nombres) # muestra la lista vacía

# Eliminar la lista
del nombres
#print(nombres) # no imprime nada porque se borró la lista

# Tuplas: son inmutables, es decir, no se pueden modificar
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina)) # largo de una tupla en números

# Acceder a un elemento, para esto utilizamos corchetes, no paréntesis
print(cocina[0])
# mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2]) # muestra 2 elementos

# Ejemplo de tupla
verduras = ('papas',) # en una tupla no debe faltar la coma, aunque haya 1 solo item
print(verduras)

# Recorremos los elementos de la tupla
for cocinar in cocina: # Print está usando \n backslash n para saltos de líneas
    print(cocinar, end=' ') # Usamos end= para eliminar los saltos de línea

# Conversión de tupla a lista e inverso
cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n',cocina)

# del cocina # esto es para eliminar la tupla


