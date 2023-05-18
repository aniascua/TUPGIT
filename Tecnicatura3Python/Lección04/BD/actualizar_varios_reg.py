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
            sentencia = 'UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s'

            # Cambiamos el registro:
            valores = (
                ('Juan Carlos', 'Roldan', 'rcarlos@mail.com', 1),
                ('Romina', 'Ayala', 'ayalar@mail.com', 5),
                ('Raul', 'Gomez', 'raul@mail.com', 7),
                ('Ricardo', 'Ricardin', 'ricardin@mail.com', 8),
                ('Felipe', 'Felix', 'felix@mail.com', 9),
                ('Franco', 'Franquin', 'franco@mail.com', 10),
                ('Ana', 'Any', 'any@mail.com',11),
                ('Homero', 'Simpson', 'homero@mail.com', 12),
                ('Bart', 'Simpson', 'barto@mail.com', 13)
            )

            cursor.executemany(sentencia, valores) # De esta manera ejecutamos la sentencia

            # También modificamos el registro:
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()