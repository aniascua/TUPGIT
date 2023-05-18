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
            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('INGRESE EL N° DE REGISTRO A ELIMINAR: ')
            valores = (entrada,) # Eliminamos ese registros de la tabla

            cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia

            # También modificamos el registro:
            registro_eliminado = cursor.rowcount
            print(f'El registro eliminado es: {registro_eliminado}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()