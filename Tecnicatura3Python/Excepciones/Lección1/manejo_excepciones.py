from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Ingrese el primer número: '))
    b = int(input('Ingrese el segundo número: '))
    if a == b:
        raise NumerosIgualesException('Son números iguales')
    resultado = a / b  # modificamos
except TypeError as e:
    print(f'TypeError - hay otro error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError Ocurrió un error: {type(e)}')
except Exception as e:
    print(f'Esto es el error: {type(e)}')
else:
    print('No se arrojó ninguna exception')
finally:  # Siempre se va a ejecutar
    print('Ejecución de este bloque finally')

print(f'El resultado es: {resultado}')
print('Seguimos...')
