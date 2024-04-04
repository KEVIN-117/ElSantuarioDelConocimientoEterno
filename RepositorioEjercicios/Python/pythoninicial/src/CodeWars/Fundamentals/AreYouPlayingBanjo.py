def are_you_playing_banjo(name: str):
    return name + " plays banjo" if name[0].lower() == 'r' else name + " does not play banjo"



if __name__ == '__main__':
    print(are_you_playing_banjo("martin"))
    print(are_you_playing_banjo("Rikke"))
    print(are_you_playing_banjo("bravo"))
    print(are_you_playing_banjo("rolf"))