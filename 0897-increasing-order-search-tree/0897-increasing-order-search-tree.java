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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        computeIncreasingBST(root, list);
        return createIncreasingOrderSearchTree(list);
    }

    public void computeIncreasingBST(TreeNode root, List<Integer> list) {
        if(root == null) return;

        computeIncreasingBST(root.left, list);
        list.add(root.val);
        computeIncreasingBST(root.right, list);
    }

    public TreeNode createIncreasingOrderSearchTree(List<Integer> list){
        if(list == null) return null;
        
        TreeNode head = null, tail = null;

        for(Integer num: list){
            TreeNode newNode = new TreeNode(num);
            if(head == null){
                head = newNode;
                tail = head;
            }else{
                tail.right = newNode;
                tail = newNode;
            }
        }

        return head;
    }

}