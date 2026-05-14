class isGoodArray {
    public boolean isGood(int[] nums) {
        int maxi=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            maxi=Math.max(nums[i],maxi);
        }
        if(maxi != nums.length - 1) {
            return false;
        }

        for(int i=1;i<maxi;i++){
            if(mpp.getOrDefault(i,0)!=1){
                return false;
            }
        }
        if(mpp.getOrDefault(maxi, 0) != 2) {
            return false;
        }
        return true;
    }
}