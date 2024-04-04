class Node:
    def __init__(self, data):
        self.data = data
        self.node = None
    def getData(self):
        return self.data
    def getNext(self):
        return self.node
    def setData(self, data):
        self.data = data
    def setNext(self, data):
        self.node = data
