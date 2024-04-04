import threading

import os


def cmd():
    os.system("start cmd")


def notepad():
    os.system("notepad")


if __name__ == "__main__":
    t1 = threading.Thread(target=cmd())
    t2 = threading.Thread(target=notepad())

    t1.start()
    t2.start()

    t1.join()
    t2.join()
