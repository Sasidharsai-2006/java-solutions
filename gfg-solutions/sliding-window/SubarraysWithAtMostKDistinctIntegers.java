import java.util.HashMap;

public class SubarraysWithAtMostKDistinctIntegers {
  public int countAtMostK(int arr[], int k) {
        // code here
        int count=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int l=0;
        int r=0;
        while(r<arr.length){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
            while(mpp.size()>k){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l])==0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
            if(mpp.size()<=k){
                count=count+(r-l+1);
            }
            r++;
        }
        return  count;
  }
}
