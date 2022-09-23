# Clase 13/09/2022
# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase pero sin espacios en blanco,
# y además un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:
# frase = vivir por siempre en paz
# frase final = virirporsiempreenpaz
# N° de caracteres = 20

frase1 = input('INGRESE UNA FRASE: ')
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += 1
frase1 = frase2
print(f'\nFRASE FINAL: {frase1}')
print(f'N° DE CARACTERES: {len(frase1)}')
