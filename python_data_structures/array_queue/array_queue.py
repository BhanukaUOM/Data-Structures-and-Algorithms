class Queue:

    def __init__(self):
        self.tail = 0
        self.head = 0
        self.queue = []

    def is_empty(self):
        return self.tail == self.head

    def enqueue(self, item):
        self.queue.append(item)
        self.tail += 1

    def dequeue(self):
        item = self.queue[self.head]
        self.queue[self.head] = None
        self.head += 1
        if self.head == self.tail:
            self.__left_shift()
        return item

    def __left_shift(self):
        i = self.head
        j = 0
        while i < self.tail:
            self.queue[j] = self.queue[i]
            j += 1
