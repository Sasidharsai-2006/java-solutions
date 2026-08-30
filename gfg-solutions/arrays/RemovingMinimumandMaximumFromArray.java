class RemovingMinimumandMaximumFromArray{
  public int minimumDeletions(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        if (n == 1) {
            return 1;
        }
        for(int i=0;i<n;i++){
            mini=Math.min(mini,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
        int frontdelete=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mini){
                frontdelete=Math.max(i+1,frontdelete);
            }
            if(nums[i]==maxi){
                frontdelete=Math.max(i+1,frontdelete);
            }
        }
        int backdelete=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mini){
                backdelete=Math.max(backdelete,n-i);
            }
            if(nums[i]==maxi){
                backdelete=Math.max(backdelete,n-i);
            }
        }
        int len1=0;
        int len2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mini){
                len1=i+1;
            }
            if(nums[i]==maxi){
                len2=i+1;
            }
        }
        int first = Math.min(len1, len2);
        int second = n - Math.max(len1, len2)+1;
        int total = first + second;
        int ans=Math.min(frontdelete,Math.min(backdelete,total));
        return ans;
    }
}