from data_structures.linked_list.linked_list import LinkedList


def main():

    list_ = LinkedList()
    list_.insert(1)
    list_.insert(2)
    list_.insert(3)

    assert list_.get_size() == 3
    list_.delete(3)
    assert list_.get_size() == 2
    assert list_.get(3) is None


if __name__ == "__main__":
    main()
