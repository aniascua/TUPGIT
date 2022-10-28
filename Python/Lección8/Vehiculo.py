# ASCUA Ana
# Clase 11 - 25/10/2022

class Vehiculo:
    """
    Definir una clase padre llamada Vehículo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehículo.
    La clase padre debe tener los siguientes atributos y métodos:

    Vehiculo (clase padre)
    - Atributos (color, ruedas)
    - Métodos (__init__()  y __str__() )

    Auto (clase hija de Vehículo)
    - Atributos (velocidad (km/h)
    - Métodos (__init__()  y __str__() )

    Bicicleta(clase hija de vehículo)
    - Atributos (tipo(urbana/montaña, etc)
    - Métodos (__init__(color, ruedas, tipo)  y __str__() )

    Crear un objeto de cada clase
    """

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color del vehículo: ' + self.color + ', cantidad de Ruedas: ' + str(self.ruedas)


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad: ' + str(self.velocidad) + ' km/h.'


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ', Tipo de bici: ' + self.tipo


# Primer objeto de la clase padre Vehículo:
vehiculo = Vehiculo('Blanco', 4)
print(vehiculo)

# Segundo objeto, pero ahora de la clase Auto:
auto = Auto("Blanco", 4, 120)
print(auto)

# Tercer objeto, de la clase hija Bicicleta:
bici = Bicicleta("Amarillo", 2, 'BMX')
print(bici)
