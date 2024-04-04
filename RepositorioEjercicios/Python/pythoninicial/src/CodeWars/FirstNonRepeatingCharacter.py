def first_non_repeating_letter(s):

    for i in range(len(s)):
        if s.upper().count(s[i]) == 1 or s.lower().count(s[i]) == 1:
            return s[i]
    return ''


print(first_non_repeating_letter('stress'))
print(first_non_repeating_letter("moonmen"))
print(first_non_repeating_letter(""))
print(first_non_repeating_letter("Go hang a salami, I\'m a lasagna hog!"))
print(first_non_repeating_letter("sTreSS"))