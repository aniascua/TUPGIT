from logger_base import log
from conexion import Conexion

# 11.3 Creamos la Clase CursorDelPool -> Parte 1 (yo):
class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None

    def __enter__(self):
        log.debug('Inicio del método with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

# 11.3 Creamos la Clase CursorDelPool -> Parte 2
    def __exit__(self, tipo_exception, valor_exception, detalle_exception):
        log.debug('Se ejecuta el método exit')
        if valor_exception:
            self._conexion.rollback()
            log.debug(f'Ocurrió una excepción: {valor_exception}')
        else:
            self._conexion.commit()
            log.debug('Commit de la transacción')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)

# 11.4 Pruebas del CursorDelPool -> Parte 1:
if __name__ == '__main__':
    with CursorDelPool() as cursor:
        log.debug('Dentro del bloque with')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())

# 11.4 Pruebas del CursorDelPool -> Parte 2: no hay, es el mismo video que parte 1

# 11.5 Pruebas de personaDAO -> Parte 1: se realizan cambios en persona_dao.py (se realizan cambios en SELECT)

# 11.5 Pruebas de personaDAO -> Parte 2: video 7 Y 8 (SE REALIZAN CAMBIOS EN persona_dao.py, INSERT registros. ELIMINAR registros)