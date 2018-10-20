from data_structures.array_queue.array_queue import Queue


def main():
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)

    assert q.dequeue() == 1
    assert q.dequeue() == 2
    assert q.dequeue() == 3
    assert q.dequeue() == 4
    assert q.dequeue() == 5


if __name__ == "__main__":
    main()
