class MinimumNumberinasortedrotatedarray {
  static int minNumber(int nums[], int loww, int highh) {
        // Your code here
        int low=loww;
        int high=highh;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                mini=Math.min(mini,nums[low]);
                low=mid+1;
            }
            else{
                mini=Math.min(mini,nums[mid]);
                high=mid-1;
            }
        }
        return mini;
    }
}