import java.util.HashMap;
public class LongestSubarrayOfSumk {
   public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=arr.length;
        int maxlen=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            int rem=sum-k;
            if(mpp.containsKey(rem)){
                maxlen=Math.max(maxlen,i-mpp.get(rem));
            }
            if(!mpp.containsKey(sum)){
                 mpp.put(sum,i);
            }
        }
        return maxlen;
    }
}
