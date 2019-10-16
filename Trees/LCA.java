public class LCA {
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)  {
            return null;
        }
        // this means it found a value that is p or q. Now pass that node up in recursion.
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode leftSubTree = lca(root.left, p, q);
        TreeNode rightSubTree = lca(root.right, p, q);
        if (leftSubTree == null) {
            return rightSubTree;
        }
        if (rightSubTree == null) {
            return leftSubTree;
        }
        return root;
    } 
}