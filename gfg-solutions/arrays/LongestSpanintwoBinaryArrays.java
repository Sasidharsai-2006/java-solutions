import java.util.HashMap;

public class LongestSpanintwoBinaryArrays {
   public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int prefixsum=0;
        int maxlen=0;
        for(int i=0;i<a1.length;i++){
            int diff=a1[i]-a2[i];
            prefixsum+=diff;
            if(prefixsum==0){
                maxlen=i+1;
            }
            if(mpp.containsKey(prefixsum)){
                int prev=mpp.get(prefixsum);
                maxlen=Math.max(maxlen,i-prev);
            }
            else{
                mpp.put(prefixsum,i);
            }
        }
        return maxlen;
    }
}
