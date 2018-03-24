void add(int value){ 
        root = addRecursive(root, value); 
    } 
     
Node addRecursive(Node current, int value) { 
    if (current == null) { 
        //return new Node(value); 
Node tmp = new Node(); 
         tmp.data = value; 
         return tmp; 
    } 
  
    if (value < current.key) { 
        current.left = addRecursive(current.left, value); 
    } else if (value > current.key) { 
        current.right = addRecursive(current.right, value); 
    } else { 
        return current; 
    } 
  
    return current; 
} 
