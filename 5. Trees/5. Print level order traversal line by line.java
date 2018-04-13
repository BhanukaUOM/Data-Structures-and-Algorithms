/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
       
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if (root!=null){
            LinkedList<TreeNode> Queue = new LinkedList<>();
            Queue.add(root);

            while(!Queue.isEmpty()){
                int count = Queue.size();
                List<Integer> lvl = new ArrayList<>();

                while(count>0){
                    TreeNode tmp = Queue.poll();
                    lvl.add(tmp.val);
                    if(tmp.left != null)
                        Queue.add(tmp.left);
                    if(tmp.right != null)
                        Queue.add(tmp.right);
                    count--;
                }
                list.add(lvl);
            }
        }
        
        return list;
    }
}
