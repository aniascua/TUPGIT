from dominio.Peliculas import Pelicula
from servicios.catalogo_peliculas import CatalogoPeliculas as cp

opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar película')
        print('2. Listar películas')
        print('3. Eliminar catálogo de peliculas')
        print('4. Salir')
        opcion = int(input('Elija una opción: (1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Ingrese el nombre de la película: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_pelicula(pelicula)
        elif opcion == 2:
            cp.listar_pelicula()
        elif opcion == 3:
            cp.eliminar_pelicula()
    except Exception as e:
        print(f'Ocurrió un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa')
