class BinaryHeap:
    def __init__(self):
        self.heap = [0]
        self.n = 0

    def is_empty(self):
        return self.n == 0

    def insert(self, k):
        self.n += 1
        self.heap.append(k)
        self.__swim(self.n)

    def del_max(self):
        max_ = self.heap[1]
        self.__swap(1, self.n)
        self.heap[self.n] = None
        self.n -= 1
        self.__sink(1)
        return max_

    def __swim(self, k):
        while k > 1 and self.heap[k//2] < self.heap[k]:
            self.__swap(k//2, k)
            k //= 2

    def __sink(self, k):
        while 2*k < self.n:
            j = 2*k
            if self.heap[j] < self.heap[j+1]:
                j += 1
            if not self.heap[k] < self.heap[j]:
                break

            self.__swap(k, j)
            k = j

    def __swap(self, k, j):
        tmp = self.heap[k]
        self.heap[k] = self.heap[j]
        self.heap[j] = tmp

