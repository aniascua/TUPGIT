from figuraGeometrica import figuraGeometrica
from Color import Color


class Cuadrado(figuraGeometrica, Color):
    def __init__(self, lado, color):
        # super.__init__(lado)
        figuraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f'{figuraGeometrica.__str__(self)} {Color.__str__(self)}'
