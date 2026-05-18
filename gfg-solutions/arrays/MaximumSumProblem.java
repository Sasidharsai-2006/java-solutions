class MaximumSumProblem {
    public int maxSum(int n) {
        // code here.
       HashMap<Integer, Integer> dp = new HashMap<>();
        if(n == 0) {
            return 0;
        }
        if(dp.containsKey(n)) {
            return dp.get(n);
        }

        int breakValue =
                maxSum(n / 2) +
                maxSum(n / 3) +
                maxSum(n / 4);
        int ans = Math.max(n, breakValue);
        dp.put(n, ans);
        return ans;
    }
}