import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class FrequenciesinaLimitedArray{
  public List<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=arr.length;i++){
            if(!mpp.containsKey(i)){
                ans.add(0);
            }
            else{
                ans.add(mpp.get(i));
            }
        }
        return ans;
    }
}