# Clase 8 - 5/10/22
# Creamos nuestra primera Clase en Python

class Persona:  # Creamos una clase

    # Atributos de método: INIT DUNDER: método especial para inicializar atributos
    # *args para tuplas, y **kwargs para diccionarios (se ponen en ese orden)
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni  # Este atributo está encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this de Java
        print(
            f'La clase Persona tiene los siguientes datos: {self.nombre}, {self.apellido}, {self._dni}, {self.edad}, la dirección es: {self.args}, y los datos importantes son: {self.kwargs}')


persona1 = Persona('Ana', 'Ascua', 231545151, 26)  # Necesitamos enviar argumentos
print(persona1.nombre, persona1.edad, persona1.apellido)

persona2 = Persona('Pepe', 'Logan', 256985548, 30)
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

print(f'El objeto2 de la clase Persona: De nombre: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}')

print('\nTarea: Mostrar objeto 1 con interpolación:')
print(f'El objeto1 de la clase Persona se llama: {persona1.nombre} {persona1.apellido} y tiene {persona1.edad} años')

# Modificar los atributos de un objeto:
persona1.nombre = 'Jake'
persona1.apellido = 'Paul'
persona1.edad = 27
print(
    f'El objeto1 MODIFICADO de la clase Persona ahora se llama: {persona1.nombre} {persona1.apellido} y tiene {persona1.edad} años')

# Los atributos son CARACTERÍSTICAS
# Los métodos son EL COMPORTAMIENTO que van a tener los objetos (acciones)

# Un método es igual que una función.
# El método está asociado a una clase y la función no es propia de sí misma
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automática

persona2.mostrar_detalle()

# Persona.mostrar_detalle() # Debemos pasarle una referencia para el self o dará error
persona1.telefono = '123456789'
print(f'Este es el teléfono: {persona1.telefono}')  # Hemos creado un atributo de un objeto

# print(persona2.telefono)  # El objeto persona2 no tiene este atributo, da error

persona3 = Persona('Pepito', 'Romero', 256988777, 22, 'Teléfono', '2612345666634', 'Calle USA', 'Manzana', 77, 'Casa',
                   18,
                   Altura=1.70, Peso=105, colorFavorito='Verde', Auto='Peugeot', Modelo=2021)
persona3.mostrar_detalle()
print(persona3._dni)  # Esto no se debe utilizar en python(está encapsulado), esto dice que desconocemos Python

# persona3.__nombre # Está totalmente encapsulado
