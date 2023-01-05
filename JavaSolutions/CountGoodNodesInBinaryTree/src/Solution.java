/*
 Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return chase_nodes(root, root.val);
    }

    public int chase_nodes(TreeNode node, int highest_value){
        if (node == null) return 0;
        int good_nodes = 0;
        if(node.val >= highest_value){
            good_nodes++;
            highest_value = node.val;
        }
        good_nodes += chase_nodes(node.left, highest_value);
        good_nodes += chase_nodes(node.right, highest_value);
        return good_nodes;
    }

//    public static class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode() {}
//         TreeNode(int val) { this.val = val; }
//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//
//    }

//    public static class Tree {
//        Deque<TreeNode> tree = new ArrayDeque(){};
//        Tree(int[] args){
//            for(int i = 0; i < args.length; i++){
//                if (args[i] != "null"){
//
//                }
//            }
//        }
//    }
}