class MergeSort:

    def __init__(self, a):
        self.a = a

    def sort(self):
        self.__merge_sort(0, len(self.a)-1)
        return self.a

    def __merge_sort(self, left_start, right_end):
        if left_start >= right_end:
            return

        middle = left_start + (right_end - left_start) // 2

        self.__merge_sort(left_start, middle)
        self.__merge_sort(middle+1, right_end)
        self.__merge(left_start, middle, right_end)

    def __merge(self, left_start, middle, right_end):
        left = left_start
        right = middle + 1
        tmp = []

        while left <= middle and right <= right_end:
            if self.a[left] < self.a[right]:
                tmp.append(self.a[left])
                left += 1
            else:
                tmp.append(self.a[right])
                right += 1

        while left <= middle:
            tmp.append(self.a[left])
            left += 1

        while right <= right_end:
            tmp.append(self.a[right])
            right += 1
            
        for index, val in enumerate(tmp):
            self.a[left_start + index] = val
