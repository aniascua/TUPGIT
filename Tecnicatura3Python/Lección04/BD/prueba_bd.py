# Clase 4 - Conectarse a una base de datos con Python y PostgreSQL
# 24/04/2023

import psycopg2

# Conectarse a la base de datos creando una conexión
conexion = psycopg2.connect(
    user='postgres',
    password='Administrador',
    host='localhost',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' # %s es un placeholder
            id_persona = input('INGRESE UN NÚMERO PARA EL ID_PERSONA: ')
            cursor.execute(sentencia, (id_persona,)) # De esta manera ejecutamos la sentencia
            registros = cursor.fetchone() # Recuperamos todos los registros que serán una lista
            print(registros)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()

# https://www.psycopg.org/docs/usage.html

# Creamos el objeto tipo cursor
cursor = conexion.cursor()

sql = 'SELECT * FROM persona'
cursor.execute(sql)  # De esta manera ejecutamos la sentencia sql

resultados = cursor.fetchall()

print(resultados)

# Para ejecutar el archivo en la terminal
cursor.close()
conexion.close()
