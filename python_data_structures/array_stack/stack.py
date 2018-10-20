class Stack:
    def __init__(self):
        self.stack = []
        self.pointer = 0

    def is_empty(self):
        return self.pointer == 0

    def push(self, item):
        self.stack.append(item)
        self.pointer += 1

    def pop(self):
        item = self.stack[self.pointer-1]
        del self.stack[self.pointer-1]
        self.pointer -= 1
        return item
