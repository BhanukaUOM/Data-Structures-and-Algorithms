//Pre-Order 
 
void preOrder(Node root) { 
    if(root != null){ 
        System.out.print(root.data+ " "); 
        preOrder(root.left); 
        preOrder(root.right); 
    } 
} 
 
 
 
//Post-Order 
 
void postOrder(Node root) { 
    if(root != null){ 
        postOrder(root.left); 
        postOrder(root.right); 
        System.out.print(root.data+ " "); 
    } 
} 
 

//In-Order 
 
void inOrder(Node root) { 
    if(root != null){ 
        inOrder(root.left); 
        System.out.print(root.data+ " "); 
        inOrder(root.right); 
    } 
} 
 
 
//Level-Order 
 
void levelOrder(Node root) { 
       Node tmp; 
        
       if(root != null){ 
           Queue<Node> queue = new LinkedList<Node>();  
           queue.add(root); 
        
       while(!queue.isEmpty()){ 
            tmp = queue.poll(); 
           System.out.print(tmp.data+" "); 
            
            if(tmp.left != null){ 
                queue.add(tmp.left); 
            } 
           if(tmp.right != null){

                queue.add(tmp.right); 
            } 
       } 
 } 
 
} 
