class Node { 
     int data; 
     Node next; 
  } 
 
void Print(Node head) { 
    if(head != null) 
        while(head != null){ 
            System.out.println(head.data); 
            head = head.next; 
        } 
} 
