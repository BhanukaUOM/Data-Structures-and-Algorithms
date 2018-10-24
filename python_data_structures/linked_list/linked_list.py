from data_structures.linked_list.Node import Node


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def is_empty(self):
        return self.head is None

    def get_size(self):
        return self.size

    def insert(self, item):
        node = Node(item)

        if self.is_empty():
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node

        self.size += 1
        return True

    def delete(self, item):
        if self.head.item == item:
            self.head = self.head.next
            if self.head.next is None:
                self.tail = self.head
            self.size -= 1
            return True

        current = self.head

        while current is not None:
            if current.next.item == item:
                current.next = current.next.next
                if current.next is None:
                    self.tail = current
                self.size -= 1
                return True
            current = current.next
        return False

    def get(self, item):
        current = self.head
        while current is not None:
            if current.item == item:
                return item
            current = current.next
        return None
