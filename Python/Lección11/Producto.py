# Python clase 15 POO Parte 8 -  Diseño de clases y Sobrecarga de Operadores
# ASCUA ANA

class Producto:
    contador_productos = 0

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1  # Aumento para la variable de clase
        self._id_producto = Producto.contador_productos  # Asignación desde la variable de clase
        self._nombre = nombre
        self._precio = precio

    # GETTERS AND SETTERS PARA NOMBRE Y PRECIO:
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    # MÉTODO STR - Sobreescribimos el método str
    def __str__(self):
        return f'ID Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


if __name__ == '__main__':  # Solo será visible si cuando se la prueba, se ejecuta desde acá
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalon', 150.00)
