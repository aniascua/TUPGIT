class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f'{self.nombre} {other.nombre}'  # Se unen los 2 nombres separados

    def __sub__(self, otro):  # Sub significa substraction (resta)
        return self.edad - otro.edad


# Creamos objetos de la clase Persona:
persona1 = Persona('Ana', 27)
persona2 = Persona('Pepito', 22)

# persona1.__add__(persona2) sintaxis interna y automática
print(persona1 + persona2)
# mostramos la resta y restará los números de las edades:
print(persona1 - persona2)
