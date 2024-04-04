#import this

countries = {"MX", "COL", "ARG", "USA"}
northAm = {"USA", "CANADA"}
centralAm = {"MX", "GT", "BZ"}
southAm = {"COL", "BZ", "ARG"}

new_set = set(countries.union(northAm, centralAm, southAm))
# Escribe tu solución 👇

print(new_set)