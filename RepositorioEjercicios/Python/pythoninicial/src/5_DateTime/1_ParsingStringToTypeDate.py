import datetime
da = datetime.datetime.strptime(str(datetime.datetime.now()).split(".")[0], "%Y-%m-%d %H:%M:%S")


def convertToDate(date):
    """
    esta funcion recive como parametro date en string
    :param date:
    :return: date de tipo datetime
    """
    return datetime.datetime.strptime(str(date).split(".")[0], "%Y-%m-%d %H:%M:%S")

d = "2023-01-27 15:19:59.167090"
print(type(d), d)
print(type(convertToDate(d)), convertToDate(d))