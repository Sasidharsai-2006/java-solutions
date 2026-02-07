import java.util.*;
public class LongestsubarraywithAtmosttwodistinctintegers {
  public int totalElements(int[] arr) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<arr.length){
            mpp.put(arr[j],mpp.getOrDefault(arr[j],0)+1);
            while(mpp.size()>2){
                mpp.put(arr[i],mpp.get(arr[i])-1);
                if(mpp.get(arr[i])==0){
                    mpp.remove(arr[i]);
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
       return maxlen;
    }
}
