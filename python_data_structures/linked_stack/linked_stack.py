from data_structures.node import Node


class LinkedStack:

    def __init__(self):
        self.last_ = None

    def push(self, item):
        self.last_ = Node(item, self.last_)
        return True

    def pop(self):
        item = self.last_.get_item()
        self.last_ = self.last_.get_next()
        return item
