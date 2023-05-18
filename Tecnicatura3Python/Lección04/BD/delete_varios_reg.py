# Clase 5 - ELIMINAR O MODIFICAR VARIOS REGISTROS

import psycopg2 # Esto es para poder conectarnos a PostgreSQL

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
            sentencia = 'DELETE FROM persona WHERE id_persona IN %s'
            entrada = input('INGRESE LOS N° DE REGISTROS A ELIMINAR (separados por coma): ')
            valores = (tuple(entrada.split(', ')),) # Eliminamos esos registros de la tabla

            cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia

            # También modificamos el registro:
            registros_eliminados = cursor.rowcount
            print(f'Los registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()