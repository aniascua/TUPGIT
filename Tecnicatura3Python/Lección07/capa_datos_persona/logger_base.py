# Python clase 7 - capa de datos - logger base
# 22/05/2023

import logging as log

# docs.python.org/3/howto/logging.html
# Llamamos a una configuración básica

log.basicConfig(level=log.INFO,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                datefmt='%I:%M:%S %p',
                handlers=[
                    log.FileHandler('capa_datos_persona.log'),
                    log.StreamHandler()
                ])


if __name__ == '__main__':
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensaje a nivel warning')
    log.error('Mensaje a nivel error')
    log.critical('Mensaje a nivel critical')