def merge_lists(nums1, m, nums2, n):
    # Tu código aquí 👇
    pointerOne = m + n - 1
    pointerTwo = m - 1
    pointerThree = n - 1

    while pointerOne >= 0 and pointerTwo >= 0 and pointerThree >= 0:
        if nums2[pointerThree] > nums1[pointerTwo]:
            nums1[pointerOne] = nums2[pointerThree]
            pointerThree -= 1
        elif nums2[pointerThree] < nums1[pointerTwo]:
            nums1[pointerOne] = nums1[pointerTwo]
            pointerTwo -= 1
        elif nums2[pointerThree] == nums1[pointerTwo]:
            nums1[pointerOne] = nums2[pointerThree]
            pointerTwo -= 1
        pointerOne -= 1
    if pointerOne >= 0 and pointerThree >= 0:
        nums1[pointerOne] = nums2[pointerThree]
    return nums1


# Arrays de prueba 1
nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3
response = merge_lists(nums1, m, nums2, n)
print(response)

# Arrays de prueba 2
nums1 = [1, 2, 3, 0, 0, 0, 0]
m = 3
nums2 = [-4, 2, 3, 9]
n = 4
response = merge_lists(nums1, m, nums2, n)
print(response)
