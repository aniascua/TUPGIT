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

# Creamos el objeto tipo cursor
cursor = conexion.cursor()

sql = 'SELECT * FROM persona'
cursor.execute(sql)  # De esta manera ejecutamos la sentencia sql

resultados = cursor.fetchall()

print(resultados)

# Para ejecutar el archivo en la terminal
cursor.close()
conexion.close()
