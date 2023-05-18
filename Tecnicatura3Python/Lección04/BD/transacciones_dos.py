# 13-05-2023 - Python Clase 6:

import psycopg2 as bd

# Conectarse a la base de datos creando una conexión
conexion = bd.connect(user='postgres',password='Administrador',host='localhost',port='5432',database='test_bd')
try:
    conexion.autocommit = False # Desactivar el autocommit y no se guarda automáticamente en la BD
    # conexion.autocommit directamente no debería estar, inicia la transacción
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre,apellido,email) VALUES(%s,%s,%s)'
    valores = ('Pepe', 'Español', 'pepe@mail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan', 'Juarez', 'jcjuarez@mail.com', 1)
    cursor.execute(sentencia, valores)

    conexion.commit() # Hacemos el commit manualmente, se cierra la transacción
    print('Termina la transacción')
except Exception as e:
    conexion.rollback() # Si hay un error, se hace el rollback
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()