class MinimumElementAfterReplacementWithDigitSum{
  public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int val=Finddigitsum(nums[i]);
            ans=Math.min(ans,val);
        }
        return ans;
    }
    public static int Finddigitsum(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
}