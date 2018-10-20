class BinarySearch:

    def __init__(self, values):
        self.values = values

    def search(self, key):
        low = 0
        high = len(self.values)

        while low <= high:
            middle = (high + low) // 2  # // -> converts to int

            if self.values[middle] < key:
                low = middle + 1
            elif self.values[middle] > key:
                high = middle - 1
            else:
                return middle
        return -1


values = [0, 1, 2, 3, 4, 5, 6]

bs = BinarySearch(values)

assert bs.search(3) == 3
assert bs.search(0) == 0
assert bs.search(4) == 4
assert bs.search(5) == 5
assert bs.search(6) == 6
