public class UniqueBst {
    public int uniqueBst(int n) {
        int[] opt = new int[n+1];
        opt[0] = 1;
        opt[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                opt[i] += opt[j-1]*opt[i-j];
            } 
        }
        return opt[n];
    }
}