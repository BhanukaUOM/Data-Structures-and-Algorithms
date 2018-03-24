Node Insert(Node head,int data) { 
    Node tmp = new Node(); 
    tmp.data = data; 
    Node t = head; 
    if(head==null){ 
        return tmp; 
    } 
     
    while(head.next!=null) 
        head = head.next; 
     
    head.next = tmp; 
    return t; 
} 
