public class MaximumTotalSubarrayValueI {
  public long maxTotalValue(int[] nums, int k) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int num:nums){
            mini=Math.min(mini,num);
            maxi=Math.max(maxi,num);
        }
        return 1L * (maxi - mini) * k;
    }
}
