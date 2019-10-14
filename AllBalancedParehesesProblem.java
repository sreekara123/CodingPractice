public class AllBalancedParehesesProblem {
    List<String> ret = new ArrayList<>();
    public List<String> allBalancedParentheses(int n) {
        backtack(n, n, "");
        return ret;
    }

    public void backtack(int left, int right, String s) {
        if (left == 0 && right == 0) {
            ret.add(s);
        }
        if (left > 0) {
            backtack(left-1, right, s+"(");
        }
        if (right > left) {
            backtack(left, right-1, s+")");
        }
    }
}
