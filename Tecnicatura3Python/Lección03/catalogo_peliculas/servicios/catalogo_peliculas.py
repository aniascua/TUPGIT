import os


class CatalogoPeliculas:
    ruta_archivo = "peliculas.txt"

    @classmethod
    def agregar_pelicula(cls, pelicula):
        with open(cls.ruta_archivo, "a", encoding="utf8") as archivo:
            archivo.write(f'{pelicula.nombre}')

    @classmethod
    def listar_pelicula(cls):
        with open(cls.ruta_archivo, "r", encoding="utf8") as archivo:
            print('Catalogo de peliculas'.center(50, '-'))
            print(archivo.read())

    @classmethod
    def eliminar_pelicula(cls):
        os.remove(cls.ruta_archivo)
        print('Archivo eliminado: {cls.ruta_archivo}')
