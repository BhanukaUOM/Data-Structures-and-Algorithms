class HeapSort:

    def sort(self, values):
        n = len(values)-1
        i = n // 2

        while i >= 0:
            self.__sink(values, i, n)
            i -= 1

        while n >= 1:
            tmp = values[n]
            values[n] = values[0]
            values[0] = tmp
            n -= 1
            self.__sink(values, 0, n)

    def __sink(self, values, k, n):
        while 2*k < n:
            j = 2*k

            if values[j] < values[j+1]:
                j += 1

            if not values[k] < values[j]:
                break

            tmp = values[k]
            values[k] = values[j]
            values[j] = tmp

            k = j

