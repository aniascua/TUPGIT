# Clase 2 Python - 12/4/2023 Manejo de Archivos

# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo
with open('prueba.txt', 'r', encoding='utf8') as archivo:
    print(archivo.read())
# No hace falta ni el try ni el finally
# En el contexto de with, lo que se ejecuta de manera automática
# Utiliza diferentes métodos: __enter__ este es el que abre
# Ahora el siguiente método es el que cierra: __exit__
