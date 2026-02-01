import java.util.HashMap;

public class Subarraywith0sum {
  static boolean findsum(int arr[]) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0 || arr[i]==0 || mpp.containsKey(sum)){
                return true;
            }
            mpp.put(sum,i);
        }
        return false;
    }
}
