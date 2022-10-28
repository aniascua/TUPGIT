# ASCUA Ana
# Clase 11 - 25/10/2022
S = 'Natalia'


class Persona:  # Esta clase hereda de la clase Object
    def __init__(self, nombre, edad):  # Método innit dunder
        self._nombre = nombre
        self._edad = edad

    # Tarea:
    # Encapsular los atributos y agregar los métodos getters and setters
    # Crear otro objeto, pasar los datos para nombre, edad y sueldo
    # Mostrar estos datos, luego modificar y mostrar nuevamente:
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    # Este método (__str__) es el equivalente a ToString de Java:
    def __str__(self):  # Override = sobreescribir
        return f'Persona: [ Nombre: {self._nombre}, Edad: {self._edad} ]'


class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo} ] {super().__str__()}'  # estamos sobreescribiendo


empleado1 = Empleado('Ana', 27, 75000)
print(empleado1)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado2 = Empleado('Liliana', 38, 70000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = S
empleado2.edad = 35
empleado2.sueldo = 75000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
