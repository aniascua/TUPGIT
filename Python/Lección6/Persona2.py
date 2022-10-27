# ASCUA Ana
# Clase 10 - 18/10/2022

class Persona2:
    def __init__(self, nombre, apellido, edad):  # Está encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre}, {self._apellido}, {self._edad}')

    @property  # Esto es un decorador, el getter lo necesita
    def nombre(self):  # Método GETTER
        print('Estamos utilizando el método get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método SETTER
        print('Estamos utilizando el método set')
        self._nombre = nombre

    # Tarea: ingresar getters y setters para los atributos: apellido y edad
    # empezamos con apellido:

    @property  # decorador
    def apellido(self):  # Método GETTER
        print('Estamos utilizando el método get')
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Método SETTER
        print('Estamos utilizando el método set')
        self._apellido = apellido

    # ahora hacemos el getter y setter para edad:
    @property  # decorador
    def edad(self):  # Método GETTER
        print('Estamos utilizando el método get')
        return self._edad

    @edad.setter
    def edad(self, edad):  # Método SETTER
        print('Estamos utilizando el método set')
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')


# Para ocultar el resto del código y solamente ver Lionel Messi 35, hacemos un
# if:
if __name__ == '__main__':
    persona1 = Persona2('Ana', 'Ascua', 26)
    # print(persona1._nombre)  # Esto ya es un error y no se debe hacer
    print(persona1.nombre)  # Llamamos al método getter
    persona1.nombre = 'Juan Pedro'  # Llamamos al método setter
    print(persona1.nombre)  # Otra vez con el método getter
    print(persona1.mostrar_detalles())  # Llamamos al método mostrar detalles
    # persona1._edad = 40 # No hagamos esto porque vamos a quedar como ignorantes si hacemos esto PORQUE edad estaba encapsulado
    # Atributo read-only sería la edad porque no tiene el método set
    print(persona1.edad)  # READ ONLY. SOLO LECTURA DE LA EDAD. NO SE PUEDE MODIFICAR.

    # Tarea crear tres objetos más, utilizando los métodos getter and setter
    # para modificar, y mostrar los cambios con el método mostrar detalle

    # Objeto número uno de la tarea
    persona2 = Persona2('Pepito', 'Johns', 22)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Pepe'
    persona2.apellido = 'Romero'
    persona2.edad = 22
    print(persona2.mostrar_detalles())

    # Objeto número dos de la tarea
    persona3 = Persona2('Ariel', 'Betancud', 41)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Ari'
    persona3.apellido = 'Betnacud'
    persona3.edad = 40

    print(persona3.mostrar_detalles())

    # Objeto número tres de la tarea
    persona4 = Persona2('Natalia', 'Lucero', 35)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Nati'
    persona4.apellido = 'Luc'
    persona4.edad = 30
    print(persona4.mostrar_detalles())

    print(__name__)  # comprobación que nos va a decir donde se esta ejecutando el codigo
    # significa que hasta ahí llega el código de persona2 y luego empieza el código de PruebaPersona2
