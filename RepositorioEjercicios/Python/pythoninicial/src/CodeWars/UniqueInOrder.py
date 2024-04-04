def unique_in_order(sequence):
    return sorted(set(list(sequence))) if type(sequence) is list else sorted(set(list(sequence)),  key=lambda v: (v.upper(), v[0].islower()))

print(unique_in_order('AAAABBBCCDAABBB'))
print(unique_in_order([1, 2, 2, 3, 3]))
print(unique_in_order('ABBCcAD'))
print(unique_in_order([1, 2, 3, -1]))
print(unique_in_order(["a", "b", "b", "a"]))