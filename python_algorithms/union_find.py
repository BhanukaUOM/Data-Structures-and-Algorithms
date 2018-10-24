class UnionFind:

    def __init__(self, values):
        self.ids = []
        self.weights = []
        for i, v in enumerate(values):
            self.ids.append(v)

    def union(self, p, q):
        pid = self.ids[p]
        qid = self.ids[q]

        for i, val in enumerate(self.ids):
            if self.ids[i] == pid:
                self.ids[i] = qid
                self.weights.append(0)

    def connected(self, p, q):
        return self.ids[p] == self.ids[q]

    def quick_union(self, p, q):
        i = self.get_root(p)
        j = self.get_root(q)
        self.ids[i] = j

    def get_root(self, i):
        while i != self.ids[i]:
            # path comprasion ids[i] = ids[ids[i]]
            i = self.ids[i]
        return i

    def is_connected(self, p, q):
        return self.get_root(p) == self.get_root(q)

    def weighted_quick_union(self, p, q):
        i = self.get_root(p)
        j = self.get_root(q)

        if self.weights[i] > self.weights[j]:
            self.ids[j] = i
            self.weights[i] += self.weights[j]
        else:
            self.ids[i] = j
            self.weights[j] += self.weights[i]


arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

q = UnionFind(arr)
q.union(0, 1)
assert q.connected(0, 1)

q = UnionFind(arr)
q.union(0, 1)
q.union(0, 3)
q.union(0, 4)

assert q.is_connected(4, 1)
assert q.is_connected(3, 4)

q = UnionFind(arr)
q.union(0, 1)
q.union(0, 3)
q.union(0, 4)

assert q.is_connected(4, 1)
assert q.is_connected(3, 4)

