# Clase 2 Python - 12/4/2023 Manejo de Archivos

# Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='UTF8')  # La W es de write (escribir)
    archivo.write('Programamos con diferentes tipos de archivos en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son:\n r Read lee,\n a Append anexa,\n w Write escribe,\n x Exception crea un archivo\n')
    archivo.write('\n t esta es para texto o text, \n b de Binarios, \n w+ lee y escribe, son iguales r+\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos de editar nuestro archivo txt')

except Exception as e:
    print(e)
finally:  # Siempre se ejecuta
    archivo.close()  # Con esto se debe cerrar el archivo
# archivo.write('Todo quedó perfecto'): ESTE ES UN ERROR
