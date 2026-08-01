class PredicttheWinner{
  public boolean predictTheWinner(int[] nums) {
         int n = nums.length;

        Integer[][] dp = new Integer[n][n];

        int diff = solve(0, n - 1, nums, dp);

        return diff >= 0;
    }
    public int solve(int left, int right, int[] nums, Integer[][] dp) {

        if (left == right) {
            return nums[left];
        }

        if (dp[left][right] != null) {
            return dp[left][right];
        }

        int takeLeft = nums[left] - solve(left + 1, right, nums, dp);

        int takeRight = nums[right] - solve(left, right - 1, nums, dp);

        return dp[left][right] = Math.max(takeLeft, takeRight);
    }
}