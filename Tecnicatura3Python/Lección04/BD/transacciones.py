# 13-05-2023 - Python Clase 6:
# Transacciones en la base de datos con PostgreSQL y Python

import psycopg2 as bd

# Conectarse a la base de datos creando una conexión
conexion = bd.connect(user='postgres',password='Administrador',host='localhost',port='5432',database='test_bd')
try:
    # conexion.autocommit = False # Desactivar el autocommit y no se guarda automáticamente en la BD
    # conexion.autocommit directamente no debería estar
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre,apellido,email) VALUES(%s,%s,%s)'
    valores = ('María', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() # Hacemos el commit manualmente
    print('Termina la transacción')
except Exception as e:
    conexion.rollback() # Si hay un error, se hace el rollback
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()