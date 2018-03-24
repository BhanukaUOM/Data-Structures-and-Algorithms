package _01_Traversal; 
  
import java.util.*; 
  
  
/* 
* @author Bhanuka 
*/ 
  
class Node{ 
    int key; 
    Node left; 
    Node right; 
     
    Node(int value){ 
        key = value; 
        left = null; 
        right = null; 
    } 
} 
  
class _01_BinaryTree{ 
    Node root; 
     
    _01_BinaryTree(int value){ 
        root = new Node(value); 
    } 
     
    _01_BinaryTree(){ 
        root = null; 
    } 
     
    public static void main(String[] args){ 
        _01_BinaryTree tree = new _01_BinaryTree(); 
         
        /*create root*/ 
        tree.root = new Node(1); 
  
        /* following is the tree after above statement 
  
              1 
            /   \ 
          null  null     */ 
  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
  
        /* 2 and 3 become left and right children of 1 
               1 
             /   \ 
            2      3 
          /    \    /  \ 
        null null null null  */
  
  
        tree.root.left.left = new Node(4); 
        /* 4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */ 
    } 
} 
