import math


def son_relativamente_primos(a: int, b: int) -> bool:
    mcd: int = math.gcd(a, b)
    return mcd == 1


if __name__ == '__main__':
    num1: int = int(input())
    num2: int = int(input())
    resultado: bool = son_relativamente_primos(num1, num2)
    print(f"¿{num1} y {num2} son relativamente primos? {resultado}")