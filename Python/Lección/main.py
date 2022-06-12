'''''''''
Clase 1 de Python: variables

miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)
miVariable = "ESTO ES MAGIA!"
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x800 (los últimos 3 números del n° gigante)
print(id(y))
# Los números de memoria son volátiles, se esfuman cada vez que ejecutamos de nuevo
print(id(z))

# Comentario de una sola línea
# Tipos int, float, string, boolean
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
print(x)
print(type(x))

# Manejo de cadenas (String)
# miGrupoFavorito = "Chris Brown,"+" the best R&B singer"
miGrupoFavorito = "Chris Brown"
caracteristicas = "the best R&B singer"
print("Mi cantante favorito es: ", miGrupoFavorito, caracteristicas)

#numero1 = "7"
#numero2 = "8"
#print(int(numero1)+int(numero2))

# Tipos Booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")


# Procesar la entrada del usuario
# Función INPUT
#resultado = input("Digite un numero: ")  # regresa un dato tipo string
#print(resultado)

# Conversión de la entrada de datos
#numero1 = int(input("Ingrese el primer número: "))
#numero2 = int(input("Ingrese el segundo número: "))
#resultado = numero1 + numero2
#print("El resultado, es: ", resultado)



# Ejercicio 1: Califica tu día
#print("Cómo estuvo tu día? (1 al 10): ")
#input("Mi dia estuvo de: ")


# Ejercicio 2: Tarea Libro y Autor
titulo = input("Proporciona el título del libro: ")
autor = input("Proporciona el autor del libro: ")
print(titulo,"fue escrito por",autor)

''

# Clase 4 Laboratorio  27-04-2022  dictada en clase de Youtube
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print("Resultado de la suma: ", suma)
print(f'El resultado de la suma, es: {suma}')  #interpolación, no hace falta concatenar
# la interpolación no funciona si no escribimos la letra F al comienzo del print y antes de las comillas

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

multiplicacion = operandoA * operandoB
print(f'El resultado de la multiplicación, es: {multiplicacion}')

division = operandoA / operandoB
print(f'El resultado de la división, es: {division}')

division = operandoA // operandoB
print(f'El resultado de la división entera, es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la division o residuo (modulo) es: {modulo}')

exponente = operandoA ** operandoB
print(f'El exponente es: {exponente}')

'''''''''
'''''''''
# Ejercicio 4.2 Rectángulo - 27-04-20222
# calcular el área y perímetro de un rectángulo. para ello debemos crear
# las siguientes variables: alto (int) ancho (int). El user debe proporcionar
# los valores de alto y ancho, después se debe imprimir el resultado del siguiente formato:
# Proporciona el alto del rectángulo: 5
# Proporciona el ancho del rectángulo: 3
# Área 15
# Perímetro 16

# Las fórmulas para calcular el área y el perímetro de un rectángulo son:
# Área: alto x ancho.      Perímetro: (alto + ancho) x 2

alto = int(input('Proporciona el alto del rectangulo: '))
ancho = int(input('Proporciona el ancho del rectangulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2

print('Area: ',area)
print('Perimetro: ',perimetro)
'''''''''

'''''''''
miVariable3 = 10
print(miVariable3)

# Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 -2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparación

d = 6
b = 2
resultado = d == b  # d, es igual a b?
# resultado = 2 == 2  # de esta forma también funciona. se evalua esta linea, la de arriba se pasa por alto
# resultado = (d == b) <-- de esta manera, se evalúa de derecha a izquierda.
print(resultado)


# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)

# Operador mayor o igual que
resultado = d >= b
print(resultado)
'''''''''


'''''''''
# Ejercicio: Número par o impar   Clase 27-04

# 1. Solicitamos que el usuario ingrese un número
# 2. A este se le asigna una variable
# 3. Utilizaremos la estructura 'if-else'
# 4. La fórmula es: <num> % 2 == 0
# Esta operación nos dice si el número es par o impar

# 5. Si es TRUE, imprimimos que es par.
# 6. Si es FALSE, imprimimos que es impar.

a = int(input("Ingrese un número: "))
print(f'El residuo de la división es: {a % 2}')
if a % 2 == 0:
    print(f'El valor de a es: {a} es un número PAR')
else:
    print(f'El valor de a es: {a} es un número IMPAR')
'''''''''


'''''''''
# Ejercicio: Determinar si es mayor de edad o no     Clase 27-04

# 1. Pedir un número al usuario
# 2. Almacenar el valor en una variable
# 3. Usar la estructura 'if-else'
# 4. La fórmula es: <num> >= 18
# 5. TRUE: eres mayor de edad. imprimir
# 6. FALSE: eres menor de edad. imprimir

# MI RESOLUCIÓN:
edadAdulto = 18
numero = int(input('Ingrese un número: '))
if numero >= edadAdulto:
             print(f'MAYOR DE EDAD')
else:
            print(f'MENOR DE EDAD')
'''''''''


'''''''''
# Resolución del profe:
edadAdulto = 18
edadPersona = int(input('INGRESE SU EDAD: '))

if edadPersona >= edadAdulto:
    print(f'Tu edad es: {edadPersona}, sos mayor de edad')
else:
    print(f'Tu edad es: {edadPersona}, sos menor de edad')
'''''''''


'''''''''
# Operadores Lógicos AND    Clase 4/05
a = False
b = False
result = a and b
print(result)

# Operador OR
result = a or b
print(result)

# Operador NOT
result = not a
print(result)
'''''''''


'''''''''
# Ejercicio AND: Valor dentro de un rango   Clase 4-05

valor = int(input('INGRESE UN NÚMERO DENTRO DEL RANGO 0 AL 5: '))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f'EL VALOR {valor} está dentro del rango')
else:
    print(f'EL VALOR {valor} NO está dentro del rango')
'''''''''


# Ejercicio OR:
# La pregunta es si un padre puede asistir al juego de su hijo
# 1. Verificamos si tiene vacaciones  2. Verificamos si tiene día libre
# 3. Usar estructura if-else con el operador OR
# 4. Imprimir en pantalla
'''''''''
vacaciones = True
diaDescanso = False
if vacaciones or diaDescanso:
    print('PUEDE ASISTIR AL JUEGO')
else:
    print('TIENE TRABAJO QUE HACER')
'''''''''

'''''''''
# Mismo ejercicio pero con NOT
vacaciones = False
diaDescanso = False                  #NOT invierte el resultado.
if not (vacaciones or diaDescanso):  #NOT cambia el sentido de las cosas.
    print('PUEDE ASISTIR AL JUEGO')
else:
    print('TIENE TRABAJO QUE HACER')
'''''''''

'''''''''
# Ejercicio Rango entre 20 y 30 años
edad = int(input('DIGITE SU EDAD: '))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    print('ESTÁS DENTRO DEL RANGO DE LOS 20 A 30 AÑOS')
else:
    print('NO ESTÁS DENTRO DE ESE RANGO')
'''''''''''
'''''''''''
edad = int(input("Ingrese su edad: "))
if (edad>=20 and edad<30) or (edad>=30 and edad<40):
    print("Está en el rango de 20 a 30 años")
else:
    print("Fuera del rango de 20 a 30 años")


#SINTAXIS SIMPLIFICADA DEL OPERADOR  'AND'
if (20 <= edad <30) or (30 <= edad <40):
    print('Está en el rango de 20 a 30 años)
else:
    print('No estás dentro del rango de 20 a 30 años)

'''''''''''

'''''''''''
# Ejercicio: El mayor de 2 números
num1 = int(input('INGRESE EL PRIMER NÚMERO: '))
num2 = int(input('INGRESE EL SEGUNDO NÚMERO: '))
if num1 > num2:
    print(f'EL MAYOR ES EL {num1}')
else:
    print(f'EL MAYOR ES {num2}')
'''''''''''

# Ejercicio: Tienda de libros
# 1. Mostrar: Ingrese datos del libro
# 2. Digite el nombre del libro
# 3. Digite el ID del libro
# 4. Digite el precio del libro
# 5. Indicar si el envio es gratuito (true or false)
# 6. Mostrar: Nombre, ID, precio, Envío Gratuito?:


print('INGRESE LOS SIGUIENTES DATOS DEL LIBRO: ')
bookName = input('Ingrese el nombre del libro: ')
bookID = int(input('Ingrese el ID del libro: '))
bookPrice = float(input('Ingrese el Precio del libro : $'))
bookDelivery = input('Indicar si el envío es gratuito (TRUE/FALSE): ')
if bookDelivery == 'True':
    bookDelivery = True
elif bookDelivery == 'False':
    bookDelivery = False
else:
    bookDelivery = 'El valor es incorrecto, debe escribir True / false'
print(f'''
        Nombre: {bookName}
        ID: {bookID}
        Precio: {bookPrice}
        Envio Gratis?: {bookDelivery}
''')



