# 13-05-2023 - Python Clase 6:

import psycopg2 as bd

# Conectarse a la base de datos creando una conexión
conexion = bd.connect(user='postgres',password='Administrador',host='localhost',port='5432',database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona(nombre,apellido,email) VALUES(%s,%s,%s)'
            valores = ('Alex', 'Danvers', 'alexdanvers22@mail.com')
            cursor.execute(sentencia, valores)

            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Kara', 'Danvers', 'kluthor@mail.com', 1)
            cursor.execute(sentencia, valores)

except Exception as e:
    print(f'Ocurrió un error, se hizo un rollback: {e}')
finally:
    conexion.close()

print('Termina la transacción')
