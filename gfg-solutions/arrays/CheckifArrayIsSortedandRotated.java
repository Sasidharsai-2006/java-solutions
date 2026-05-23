class CheckIfArrayIsSortedAndRotated {
  public boolean check(int[] nums) {
        //break point intusion
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count==0 || count==1){
            return true;
        }
        return false;
    }
}