def feast(beast, dish):
    # your code here
    return beast[0] == dish[0] and beast[len(beast)-1] == dish[len(dish)-1]
print(feast("great blue heron","garlic nann"))
print(feast("brown bear","bear claw"))