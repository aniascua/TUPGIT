"""
    # Clase 9 - 11/10/2022
    Crear la clase CUBO con los atributos ANCHO, ALTO y PROFUNDIDAD.
    con un método calcular_volumen que tendrá la fórmula:
    volumen = ancho * alto * profundidad
    y que el usuario ingrese los valores.
"""


# Creamos la clase Cubo
class Cubo:
    # Método inicial INIT SELF para los atributos
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    # Método para calcular el volumen: FÓRMULA: ancho*alto*profundidad
    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


# Pedimos los datos por teclado al usuario:
ancho = int(input('INGRESE EL ANCHO: '))
alto = int(input('INGRESE LA ALTURA: '))
profundidad = int(input('INGRESE LA PROFUNDIDAD: '))

# Creamos/instanciamos un objeto de la clase Cubo:
cubo1 = Cubo(ancho, alto, profundidad)

# Mostramos el resultado por pantalla:
print(f'El volumen calculado es: {cubo1.calcular_volumen()}')
