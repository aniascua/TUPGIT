# Clase 8 - 5/10/22
# Creamos nuestra primera Clase en Python

class Persona:  # Creamos una clase

    # Atributos de método:
    def __init__(self, nombre, apellido, edad):  # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre}, {self.apellido}, {self.edad}')


persona1 = Persona('Ana', 'Ascua', 26)  # Necesitamos enviar argumentos
print(persona1.nombre, persona1.edad, persona1.apellido)

persona2 = Persona('Pepe', 'Logan', 30)
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

print(f'El objeto2 de la clase Persona: De nombre: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}')

print('\nTarea: Mostrar objeto 1 con interpolación:')
print(f'El objeto1 de la clase Persona se llama: {persona1.nombre} {persona1.apellido} y tiene {persona1.edad} años')

# Modificar los atributos de un objeto:
persona1.nombre = 'Jake'
persona1.apellido = 'Paul'
persona1.edad = 27
print(
    f'El objeto1 MODIFICADO de la clase Persona ahora se llama: {persona1.nombre} {persona1.apellido} y tiene {persona1.edad} años')

# Los atributos son CARACTERÍSTICAS
# Los métodos son EL COMPORTAMIENTO que van a tener los objetos (acciones)

# Un método es igual que una función.
# El método está asociado a una clase y la función no es propia de sí misma
persona1.mostrar_detalle()
persona2.mostrar_detalle()
