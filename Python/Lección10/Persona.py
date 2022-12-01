class Persona:
    contador_personas = 0  # variable de clase

    def __init__(self, nombre, edad):
        Persona.contador_personas += 1  # vamos incrementando
        self.id_persona = Persona.contador_personas  # asignamos el incremento cada vez que comienza una nueva Persona
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [ID: {self.id_persona}, Nombre: {self.nombre}, Edad: {self.edad}]'


# Cada persona tendrá su propio ID, y este será único
persona1 = Persona('Ana', 27)
print(persona1)
persona2 = Persona('Pepito', 22)
print(persona2)
persona3 = Persona('ElTercerId', 50)
print(persona3)
print('')  # Espacio en blanco para salto de línea
print(f'Valor del contador de personas: {Persona.contador_personas}')
