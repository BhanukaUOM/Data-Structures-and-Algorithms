static int height(Node root) { 
        if(root != null){ 
            int l = height(root.left)+1; 
            int r = height(root.right)+1; 
             
            if(l<r) 
                return r; 
            else 
                return l; 
        } else 
            return -1; 
    } 
