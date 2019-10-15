public class RootToLeafPathSum {
    public boolean pathSum(Node root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.right == null &&  root.left == null) {
            return (sum ==  0);
        }
        return pathSum(root.left, sum) || pathSum(root.right, sum);
    }
}