/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> stack = new Stack<>();
        findLeafNodes(root1, stack);
        return computeLeafValues(root2, stack) && stack.isEmpty();
    }

    private void findLeafNodes(TreeNode root, Stack<Integer> stack){
        if(root == null){
            return;
        }

        findLeafNodes(root.left, stack);
        if(root.left == null && root.right == null) stack.push(root.val);
        findLeafNodes(root.right, stack);
    }

    private boolean computeLeafValues(TreeNode root, Stack<Integer> stack){
        if(root == null){
            return true;
        }
        
        if(root.left == null && root.right == null) {
            return !stack.isEmpty() && stack.pop() == root.val;
        }

        return computeLeafValues(root.right, stack) && computeLeafValues(root.left, stack); 
    }
}