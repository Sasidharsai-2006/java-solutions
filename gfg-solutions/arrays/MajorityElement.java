import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  int majorityElement(int arr[]) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        int min=n/2;
        for(Map.Entry<Integer,Integer> num:mpp.entrySet()){
            if(num.getValue()>min){
                return num.getKey();
            }
        }
        return -1;
    }
}
