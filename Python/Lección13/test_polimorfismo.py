from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    #  print(objeto)  # De manera indirecta llama al método dunder-str de la clase Empleado o Gerente
    print(type(objeto))  # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)
    # print(objeto.departamento) no va a funcionar porque empleado no tiene ese atributo


empleado = Empleado('Ana', 100)
imprimir_detalles(empleado)

gerente = Gerente('Pepa', 200, 'IT')  # CREAMOS UN OBJECT DE LA CLASE GERENTE
imprimir_detalles(gerente)

# Polimorfismo: diferentes formas de acceder a la información de un objeto
# Definición: polimorfismo (en POO) es la capacidad que tienen ciertos lenguajes
# para hacer que, al enviar el mismo mensaje
# (o, en otras palabras, invocar al mismo método)
# desde distintos objetos, cada uno de esos objetos pueda responder
# a ese mensaje (o a esa invocación) de forma distinta.
