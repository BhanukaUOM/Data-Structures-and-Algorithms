from queue import Queue
from data_structures.bst.node import Node


class BST:

    def __init__(self):
        self.root = None

    def put(self, key, value):
        self.root = self.__put(self.root, key, value)

    def __put(self, node, key, value):
        if node is None:
            return Node(key, value)

        if key < node.key:
            node.left = self.__put(node.left, key, value)

        elif key > node.key:
            node.right = self.__put(node.right, key, value)

        elif key == node.key:
            node.value = value

        node.count = 1 + self.__size(node.left) + self.__size(node.right)
        return node

    def get(self, key):
        n = self.root
        while n is not None:
            if key < n.key:
                n = n.left
            elif key > n.key:
                n = n.right
            else:
                return n.value
        return None

    def size(self):
        return self.root.count

    def __size(self, node):
        if node is None:
            return 0
        return node.count

    def delete_min(self):
        self.root = self.__delete_min(self.root)

    def __delete_min(self, n):
        if n.left is None:
            return n.right
        n.left = self.__delete_min(n.left)
        n.count = 1 + self.__size(n.left) + self.__size(n.right)
        return n

    def delete(self, key):
        self.root = self.__delete(self.root, key)

    def __delete(self, n, key):
        if n is None:
            return None
        if key < n.key:
            n.left = self.__delete(n.left, key)  # search for a key
        elif key > n.key:
            n.right = self.__delete(n.right, key)  # search for a key
        else:
            if n.right is None:  # has no right child
                return n.left
            if n.left is None:
                return n.right
            t = n
            n = self.__min(t.right)
            n.right = self.__delete_min(n.right)  # replace with successor
            n.left = t.left
        n.count = self.__size(n.left) + self.__size(n.right) + 1  # update counts
        return n

    def min(self):
        return self.__min(self.root).key

    def __min(self, n):
        if n.left is None:
            return n
        else:
            return self.__min(n.left)

    def contains(self, key):
        return self.get(key) is not None

    def keys(self):  # in order
        que = Queue()
        self.in_order(self.root, que)
        return que

    def in_order(self, n, q):
        if n is None:
            return

        self.in_order(n.left, q)  # puts all from the left to the queue
        q.put(n.key)
        self.in_order(n.right, q)  # puts all from the left to the queue

    def bsf(self, k):
        que = Queue()
        que.put(self.root)

        while not que.empty():
            node = que.get()
            if node.value == k:
                return node
            if node.left is not None:
                que.put(node.left)
            if node.right is not None:
                que.put(node.right)
        return None

    def dsf(self, current, k):
        if current is None:
            return None

        if current.value == k:
            return current

        n = self.dsf(current.left, k)
        if n is None:
            n = self.dsf(current.right, k)
        return n

    def find_lowes_common_cncestor(self, v1, v2, root):
        while root is not None:
            if v1 < root.value and v2 < root.value:
                root = root.left
            elif v2 > root.value and v2 > root.value:
                root = root.right
            else:
                return root
        return None


bst = BST()
items = [100, -99, 40, -32, 2, 0, 3, -4, 5, 4, -5]
for i, v in enumerate(items):
    bst.put(v, v)
print(bst.bsf(-5))
print(bst.dsf(bst.root, -5))
