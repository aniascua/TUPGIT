from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0  # Variable temporal para almacenar el total temporal
        # inicializamos asignandole el 0 y luego vamos a utilizar un ciclo for para ir recorriendo
        # la lista de productos e ir asignando cada uno de los precios e irlos sumando
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + ' | '  # símbolo para separar | - (py)
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}'


if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)
    productos1 = [producto1, producto2]  # Ahora tenemos 1 lista de productos
    orden1 = Orden(productos1)  # Primer objeto Orden pasando la lista de productos
    print(orden1)

    producto3 = Producto('Short Nike', 2.500)
    print(producto3)
    producto4 = Producto('Short Under Armour', 2.500)
    print(producto4)
    productos2 = [producto3, producto4]  # Creamos la lista nueva de productos
    orden2 = Orden(productos2)
    print(orden2)

# Tarea: Modificar la orden2 ingresando nuevos productos con sus nombres y precios
# Crear una nueva lista de productos y agregarla a la orden2
