from data_structures.linked_queue.queue import Queue


def main():
    queue = Queue()

    assert queue.is_empty()

    queue.enqueue(1)
    queue.enqueue(2)

    print(queue.dequeue())


if __name__ == "__main__":
    main()
