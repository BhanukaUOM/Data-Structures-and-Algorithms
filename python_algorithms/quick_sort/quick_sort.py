class QuickSort:

    def sort(self, values):
        self.__quick_sort(values, 0, len(values)-1)

    def __quick_sort(self, values, left, right):
        if right <= left:
            return

        pivot = values[left + (right - left) // 2]
        i = self.__partition(values, left, pivot, right)

        self.__quick_sort(values, left, i-1)
        self.__quick_sort(values, i, right)

    def __partition(self, values, left, pivot, right):
        while left <= right:
            while values[left] < pivot:
                left += 1
            while values[right] > pivot:
                right -= 1

            if left <= right:
                tmp = values[left]
                values[left] = values[right]
                values[right] = tmp
                left += 1
                right -= 1

        return left


