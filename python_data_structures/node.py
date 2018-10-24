class Node:

    def __init__(self, data=None, next=None):
        self.item_ = data
        self.next_ = next

    def get_item(self):
        return self.item_

    def set_item(self, data):
        self.item_ = data

    def get_next(self):
        return self.next_

    def set_next(self, next):
        self.next_ = next

    def __str__(self):
        return str(self.item_)
