from data_structures.array_stack.stack import Stack


def main():
    s = Stack()
    s.push(1)
    s.push(2)

    assert s.pop() == 2
    assert s.pop() == 1


if __name__ == "__main__":
    main()
