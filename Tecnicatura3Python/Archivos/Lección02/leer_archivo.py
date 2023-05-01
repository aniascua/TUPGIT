# Clase 2 Python - 12/4/2023 Manejo de Archivos

archivo = open('prueba.txt', 'r', encoding='utf8')  # r de read leer, a de anexar,

# Otra forma de abrir archivos desde la PC:
# archivo = open('c:\\users\\anaas\\TUPGIT\\Tecnicatura3Python\\Archivos\\Lección02\\prueba.txt')
# print(archivo.read())

# letras: 'r' READ, 'a' APPEND, 'w' WRITE, 'x' EXCEPTION CREA UN ARCHIVO

# print(archivo.read(15))
# print(archivo.read(5))
# print(archivo.read(10)) # continuamos desde la línea anterior
# print(archivo.readline())  # lee solo la primera línea de nuestro archivo
# print(archivo.readline())  # lee la próxima línea del archivo

# Vamos a iterar el archivo, cada una de las líneas
# for linea in archivo:
# print(linea)
# print(archivo.readlines()[12])  # Accedemos al archivo como si fuese una lista

# Anexamos información, copiamos a otro
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()  # Cerramos el primer archivo
archivo2.close()  # Cerramos el segundo archivo

print('Leímos y cerramos archivos')
