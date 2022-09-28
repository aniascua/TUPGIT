# Clase 27/9/2022
# Ejercicio 4 con funciones (impuestos)
# CALCULADORA DE IMPUESTOS: Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Fórmula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx $

# Creamos la función que calcula el total del pago incluyendo el impuesto
def calcularTotalPago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    return pago_total


print('\n.:CALCULADORA DE IMPUESTOS:.\n')

# Ejecutamos la función a través de pedirle los datos al usuario:
pago_sin_impuesto = float(input('INGRESE EL PAGO SIN IMPUESTOS: $'))
impuesto = float(input('INGRESE EL MONTO DEL IMPUESTO: $'))
pago_con_impuesto = calcularTotalPago(pago_sin_impuesto, impuesto)
print(f'EL PAGO CON IMPUESTO: ${pago_con_impuesto}')
