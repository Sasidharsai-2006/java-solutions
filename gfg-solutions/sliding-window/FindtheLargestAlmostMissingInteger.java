import java.util.HashMap;

public class  FindtheLargestAlmostMissingInteger {
  public int largestInteger(int[] nums, int k) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int val=findval(nums,k,nums[i]);
            ans=Math.max(ans,val);
        }
        return ans;
    }
    public static int findval(int nums[],int k,int val){
        int left=0;
        int right=0;
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        while(right<k){
            mpp.put(nums[right],mpp.getOrDefault(nums[right],0)+1);
            right++;
        }
        if(mpp.containsKey(val)){
            count++;
        }
        while(right<n){
            mpp.put(nums[left],mpp.get(nums[left])-1);
            if(mpp.get(nums[left])==0){
                mpp.remove(nums[left]);
            }
            mpp.put(nums[right],mpp.getOrDefault(nums[right],0)+1);
            right++;
            left++;
            if(mpp.containsKey(val)){
            count++;
           }
        }
        if(count==1){
            return val;
        }
        return -1;
    }
}
