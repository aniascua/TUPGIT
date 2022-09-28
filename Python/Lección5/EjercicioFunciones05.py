# Clase 27/9/2022
# Ejercicio 5 con funciones (Celsius a Fahrenheite)
# CONVERTIDOR DE TEMPERATURAS: Realizar 2 funciones para convertir de grados celsius a fahrenheit y viceversa
# Investigar qué fórmulas necesita

# FUNCIÓN PARA CONVERTIR DE CELSIUS A FARENHEIT:
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32  # La precedencia de operaciones: 1. multiplicar, 2. división, 3. suma


celsius = float(input('INGRESE LA TEMPERATURA EN CELSIUS: '))
print(f'LA TEMPERATURA {celsius}°c EN FAHRENHEIT ES: {celsius_fahrenheit(celsius):.2f}F')


# FUNCIÓN DE FAHRENHEIT A CELSIUS:
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9


fahrenheit = float(input('INGRESE LA TEMPERATURA EN FAHRENHEIT: '))
print(f'LA TEMPERATURA {fahrenheit}F EN CELSIUS ES: {fahrenheit_celsius(fahrenheit)}°C')
