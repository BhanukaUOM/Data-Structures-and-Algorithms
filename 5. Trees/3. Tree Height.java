/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//TOP-DOWN
class Solution {
    int max = 0;
    
    public int maxDepth(TreeNode root) {
        depth(root, 0);
        return max;
    }
    
    public void depth(TreeNode node, int count){
        if(node == null){
            if(count>max)
                max = count;
        } else {
            depth(node.left, count+1);
            depth(node.right, count+1);
        }
    }
}

//BOTTOM-UP
import java.lang.*;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
