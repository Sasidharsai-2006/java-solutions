class CountSubarraysWithMajorityElementI {
   public int countMajoritySubarrays(int[] nums, int target) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cnttwo=0;
            for(int j=i;j<n;j++){
                int len=j-i+1;
                if(nums[j]==target){
                    cnttwo++;
                }
                if(cnttwo>len/2){
                    cnt++;
                }

            }
        }
        return cnt;
    }
}