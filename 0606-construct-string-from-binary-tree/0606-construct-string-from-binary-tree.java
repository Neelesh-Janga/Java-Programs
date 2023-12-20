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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        return preorder(root, new StringBuilder()).toString();
    }

    private StringBuilder preorder(TreeNode root, StringBuilder sb) {
        if(root == null){
            return sb;
        }

        sb.append(root.val);

        if(root.left != null || root.right != null){
            sb.append("(");
            preorder(root.left, sb);
            sb.append(")");
        }

        if(root.right != null){
            sb.append("(");
            preorder(root.right, sb);
            sb.append(")");
        }

        return sb;
    }
}