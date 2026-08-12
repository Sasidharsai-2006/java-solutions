class LengthofLongestSubarrayWithatMostKFrequency{
  public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        int left=0;
        int right=0;
        int maxlen=Integer.MIN_VALUE;
        while(right<n){
            mpp.put(nums[right],mpp.getOrDefault(nums[right],0)+1);
                while(mpp.get(nums[right])>k){
                    mpp.put(nums[left],mpp.get(nums[left])-1);
                    if(mpp.get(nums[left])==0){
                        mpp.remove(nums[left]);
                    }
                    left++;
                }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
        
    }
}