class Pelicula:
    def __init__(self, nombre):
        self._nombre = nombre

    def __str__(self):
        return f'Película: {self._nombre}'

    # Método GET
    @property
    def nombre(self):
        return self._nombre

    # Método SET
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    
