import java.util.HashMap;
public class CountSubarrayswithgivenXOR {
  public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int prefix=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            prefix=prefix^arr[i];
            int target=prefix^k;
            if(mpp.containsKey(target)){
                count+=mpp.get(target);
            }
            mpp.put(prefix,mpp.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
