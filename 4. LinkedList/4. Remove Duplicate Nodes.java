public static Node removeDuplicates(Node head){
        Node current = head;
        while(current.next != null) {
                while(current.data == current.next.data) {
                        current.next = current.next.next;
                }
                current = current.next;
        }
        return head;
}
