import os
import pandas as pd

os.system("cls")


class Colors:
    rojo = "\033[31m"
    verde = "\033[32m"
    naranja = "\033[33m"
    azul = "\033[34m"
    morado = "\033[35m"
    celeste = "\033[36m"
    blanco = "\033[37m" 
    pink = "\033[30m"


task = list(map(lambda x: x.strip(), str(os.popen("tasklist /fo csv").read()).split("\n")[3:]))

Image_Name = []
PID = []
Session_Name = []
Session = []
Mem_Usage = []
for i in task:
    aux = i.split("\",\"")
    auxList = []
    for j in range(len(aux)):
        if j == 0:
            Image_Name.append(aux[j].replace('"', ''))
        elif j == 1:
            PID.append(aux[j])
        elif j == 2:
            Session_Name.append(aux[j])
        elif j == 3:
            Session.append(aux[j])
        elif j == 4:
            Mem_Usage.append(aux[j].replace('"', ''))

pd.options.display.max_rows = len(task)
data = {
    "Image Name": Image_Name[:len(Image_Name) - 1],
    "PID": PID,
    "Session Name": Session_Name,
    "Session": Session,
    "Mem_Usage": Mem_Usage
}
df = pd.DataFrame(data)


def open_word():
    os.system("start WINWORD")


def open_excel():
    os.system("start EXCEL")


def open_calc():
    os.system("calc")


def open_note_pad():
    os.system("notepad")


def open_cmd():
    os.system("start cmd")


def list_process():
    """
    :return: task list with name and pid
    """
    print(df)


def list_process_pid_name():
    """
    :return: task list with name and pid
    """
    newDf = df.filter(['PID', 'Image Name'])
    print(newDf)


def list_repeating_processes():
    count_repeatings = df['Image Name'].value_counts()[df['Image Name'].value_counts() > 1]
    print(count_repeatings)


def finish_process_to_name(name: str):
    """
    :param name: str
    :return: none
    """
    os.system(f"TASKKILL /IM {name}")


def finish_process_to_pid(PID: int):
    """
    :param PID:
    :return: none
    """
    dataName = df.query(f"PID == '{PID}'")['Image Name'].values[0]
    question = input(
        Colors.rojo + f"you want to finish the process ({Colors.verde + dataName + Colors.rojo}): ").lower()
    if question == 'yes':
        os.system(f"TASKKILL /IM {dataName}")
    else:
        print(Colors.naranja + "the process continues")


options: dict = {
    1: Colors.verde + "open word".upper() + Colors.blanco,
    2: Colors.verde + "open exel".upper() + Colors.blanco,
    3: Colors.verde + "open calculator".upper() + Colors.blanco,
    4: Colors.verde + "open note pad".upper() + Colors.blanco,
    5: Colors.verde + "open console".upper() + Colors.blanco,
    6: Colors.verde + "list processes".upper() + Colors.blanco,
    7: Colors.verde + "list repeating processes".upper() + Colors.blanco,
    8: Colors.verde + "terminate process with pid".upper() + Colors.blanco,
    9: Colors.verde + "terminate process with name".upper() + Colors.blanco,
    0: Colors.rojo + "exit".upper() + Colors.blanco,
}

condition = False

while not condition:
    for x, y in options.items():
        print(f"{x} -> {y}")
    option = int(input(Colors.celeste + "Select a Option: "))
    os.system("cls")
    if option == 1:
        open_word()
    elif option == 2:
        open_excel()
    elif option == 3:
        open_calc()
    elif option == 4:
        open_note_pad()
    elif option == 5:
        open_cmd()
    elif option == 6:
        optionsList: dict = {
            1: Colors.verde + "List Full process".upper() + Colors.blanco,
            2: Colors.verde + "List process name and pid".upper() + Colors.blanco,
            0: Colors.rojo + "exit".upper(),
        }
        condition_list = False
        while not condition_list:
            for x, y in optionsList.items():
                print(f"{x} -> {y}")
            optionList = int(input(Colors.celeste + "Select a Option: "))

            if optionList == 1:
                list_process()
            elif optionList == 2:
                list_process_pid_name()
            else:
                os.system("cls")
                condition_list = True

    elif option == 7:
        list_repeating_processes()
    elif option == 8:
        finish_process_to_pid(int(input("PID: ")))
    elif option == 9:
        finish_process_to_name(input("Name Process: "))
    else:
        print(Colors.morado + "GOOG BYE")
        condition = True
