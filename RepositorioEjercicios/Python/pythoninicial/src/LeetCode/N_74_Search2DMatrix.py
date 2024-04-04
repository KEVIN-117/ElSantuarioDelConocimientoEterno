from typing import List

def searchInMatrix(matriz: List[List[int]], objetivo: int) -> bool:
    for i in range(len(matriz)):
        pointerRange = len(matriz[i])-1
        if matriz[i][pointerRange] >= objetivo:
            return binarySearch(matriz[i], objetivo) != -1
    return False


def binarySearch(nums: list, target: int) -> int:
    left = 0
    right = len(nums) - 1
    while left <= right:
        middle = (left + right) // 2
        if nums[middle] == target:
            return True
        elif target < nums[middle]:
            right = middle - 1
        else:
            left = middle + 1
    return -1

matriz = [
  [1,3,5,7],
  [10,11,16,20],
  [23,30,34,60],
]
print(matriz)

response = searchInMatrix(matriz, 3)
print(response)

response2 = searchInMatrix(matriz, 12)
print(response2)