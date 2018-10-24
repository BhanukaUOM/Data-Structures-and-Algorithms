from data_structures.linked_stack.linked_stack import LinkedStack


def main():
    stack = LinkedStack()
    stack.push(1)
    stack.push(2)

    assert stack.pop() == 2
    assert stack.pop() == 1


if __name__ == "__main__":
    main()
