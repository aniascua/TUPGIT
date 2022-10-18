"""
    # Clase 9 - 11/10/2022
    Crear una clase llamada Rectángulo, debe tener 2 atributos:
    altura y base, y el nombre del método será calcular el área
    utilizando la fórmula:
    area = base * altura.
    Pero la base y la altura deben ser ingresadas por el usuario
    y los objetos deben ser tres
"""


# Creamos la clase RECTÁNGULO:
class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    # Método para calcular el área:
    def calcular_area(self):
        return self.base * self.altura


base = int(input('INGRESE LA BASE: '))
altura = int(input('INGRESE LA ALTURA: '))

# Creamos/instanciamos un objeto de la clase Rectángulo:
rectangulo1 = Rectangulo(base, altura)  # Le pasamos los 2 argumentos de arriba

# Mostramos los datos en pantalla:
print('El área del rectángulo, es:')
print(rectangulo1.calcular_area())

# Otra forma de imprimir los datos en pantalla:
print(f'El área del rectángulo es: {rectangulo1.calcular_area()}')
