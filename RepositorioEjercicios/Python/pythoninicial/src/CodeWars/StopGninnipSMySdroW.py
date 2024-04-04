def spin_words(sentence):
    # Your code goes here
    arr = list(sentence.split(" "))
    for k, v in enumerate(arr):
        if len(v) >= 5:
            arr[k] = "".join(list(v)[::-1])
    return " ".join(arr)


def spin_words2(sentence):
    # Your code goes here
    return " ".join([x[::-1] if len(x) >= 5 else x for x in sentence.split(" ")])


print(spin_words("Hey fellow warriors"))
print(spin_words("This is a test"))
print(spin_words("This is another test"))
print(spin_words("to"))