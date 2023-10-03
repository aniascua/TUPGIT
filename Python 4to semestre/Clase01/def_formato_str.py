# dar formato a un String

nombre = 'Ana'
edad = 27
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)


# Creamos una tupla
persona = ('Carla', 'Gomez', 5000.00)
mensaje_con_formato = 'Hola %s %s . Tu sueldo es: %.2f' # % persona # Acá le pasamos el objeto tupla
print(mensaje_con_formato % persona)

nombre = 'Juan'
edad = 19
sueldo = 3000
# mensaje_con_formato = 'Nombre {} Edad {} Sueldo {:.2f}'.format(nombre, edad, sueldo)
# print(mensaje_con_formato)

mensaje = 'Nombre {0} Edad {1} Sueldo {:.2f}'.format(nombre, edad, sueldo)
print(mensaje)