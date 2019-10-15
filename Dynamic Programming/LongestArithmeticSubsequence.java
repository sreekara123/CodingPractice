public class LongestArithmeticSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int max = 0;
        for (int elem : arr) {
            int target = elem - difference;
            if (dp.containsKey(target)) {
                dp.put(elem, dp.get(target)+1);
            } else {
                dp.put(elem, 1);
            }
            max = Math.max(max, dp.get(elem));
        }
        return max;
    }
}
