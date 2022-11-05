from Color import Color
from figuraGeometrica import figuraGeometrica


class Rectangulo(figuraGeometrica, Color):
    def __init__(self, ancho, alto, color):
        figuraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)

    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f'{figuraGeometrica.__str__(self)} {Color.__str__(self)}'
