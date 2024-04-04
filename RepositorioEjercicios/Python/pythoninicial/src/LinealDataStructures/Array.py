class Array:
    def __init__(self, capacity: int, fill_value=None):
        self.items = [fill_value]*capacity

    def __iter__(self):
        return self.items


lst = Array(10)

print(lst.__iter__())