from Orden import Orden
from Producto import Producto

# PRODUCTOS:
producto1 = Producto('Camiseta', 100)
producto2 = Producto('Pantalon', 150)
producto3 = Producto('Short Nike', 2500)
producto4 = Producto('Short Under Armour', 2500)
producto5 = Producto('Short Adidas', 2500)
producto6 = Producto('Camisa Adidas AFA 2022', 22000)
producto7 = Producto('Remera Nike Negra logo', 1600)

# LISTAS DE PRODUCTOS:
productos1 = [producto1, producto2]  # Ahora tenemos 1 lista de productos
orden1 = Orden(productos1)  # Primer objeto Orden pasando la lista de productos
orden1.agregar_producto(producto7)
print(orden1)
print(f'TOTAL DE LA ORDEN 1 EN PESOS ARS: $ {orden1.calcular_total()}')

productos2 = [producto3, producto4]  # Creamos la lista nueva de productos
orden2 = Orden(productos2)
print(orden2)
print(f'TOTAL DE LA ORDEN 2 EN PESOS ARS: $ {orden2.calcular_total()}')

productos3 = [producto5, producto6]  # Otra lista
orden3 = Orden(productos3)
print(orden3)
print(f'TOTAL DE LA ORDEN 3 EN PESOS ARS: $ {orden3.calcular_total()}')
