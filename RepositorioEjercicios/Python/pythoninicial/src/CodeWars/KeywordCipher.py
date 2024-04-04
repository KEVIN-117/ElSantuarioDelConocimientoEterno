import string


def keyword_cipher(msg, keyword):
    # your code here
    """
    :argument Tercer día en su nuevo trabajo de criptoanalista y se encuentra con su tarea más difícil hasta el momento.
    :argument Su trabajo es implementar un cifrado de palabra clave simple.
    :argument Un cifrado de palabra clave es un tipo de sustitución monoalfabética donde se proporcionan dos parámetros como
              tales (cadena, palabra clave). La cadena se encripta tomando la palabra clave y descartando las letras que
              aparecen más de una vez. El resto de las letras del alfabeto que no se utilizan se añaden al final de la palabra
              clave.
    :param msg:
    :param keyword:
    :return: el mensaje encriptado
    """
    # llenamos una lista con todos las letras del alfabeto
    alphabet = list(string.ascii_lowercase)
    # creamos una lista que almacenara al  de la lista al keyword sin letras repetidas y con los que faltan de las letras del
    # alfabeto Ejemplo: keyword = wednesda --> wednsaybcfghijklmopqrtuvxz
    keywordList = list()

    # llenamos la lista keywordList la primera linea elimina las letras duplicadas Ejemplo: keyword = wednesday -> wednesay
    # y ademas suma la lista alphabet solo con los elementos que no se encuentran en  keywordList
    [keywordList.append(sweet) for sweet in list(keyword.lower()) if sweet not in keywordList] + \
        [keywordList.append(sweet) for sweet in alphabet if sweet not in keywordList]
    aux = list()

    for i in msg.lower():
        if i == ' ':
            aux.append(' ')
        else:
            aux.append(keywordList[alphabet.index(i)])
    return "".join(aux)


def keyword_cipher2(a, b):
    return a.lower().translate(
        str.maketrans(string.ascii_lowercase, "".join(dict.fromkeys(b + string.ascii_lowercase))))


print(keyword_cipher("Welcome home", "secret"))
print(keyword_cipher("hello", "wednesday"))
print(keyword_cipher("hello", "wednesday"))
print(keyword_cipher("HeLlO", "wednesday"))
