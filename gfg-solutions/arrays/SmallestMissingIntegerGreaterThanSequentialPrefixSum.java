class SmallestMissingIntegerGreaterThanSequentialPrefixSum{
  public int missingInteger(int[] nums) {
        int len=1;
        int maxlen=1;
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
                len++;
                if (len > maxlen) {
                    maxlen = len;
                    maxsum = sum;
                }
                
            }
            else{
                break;
            }
        }
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ss.add(nums[i]);
        }
        if(!ss.contains(maxsum)){
            return maxsum;
        }
        else{
            for(int i=maxsum;i<Integer.MAX_VALUE;i++){
                if(!ss.contains(i)){
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}