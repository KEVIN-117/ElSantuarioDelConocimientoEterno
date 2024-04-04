import threading

def increment_number(n: int):
    numberLits = list(range(1, n+1))
    a = open('A.txt', 'w')
    for i in numberLits:
        a.write(str(i)+'\n')

def decrement_number(n: int):
    numberLits = list(range(1, n+1))[::1]
    b = open('B.txt', 'w')
    for i in numberLits:
        b.write(str(i)+'\n')



if __name__ == "__main__":
    n = int(input())
    t1 = threading.Thread(target=increment_number(n))
    t1.start()
    t2 = threading.Thread(target=decrement_number(n))
    t2.start()

    t1.join()
    t2.join()
