import java.util.LinkedHashMap;
import java.util.Map;

public class Wordwithmaximumfrequency {
  public String maximumFrequency(String s) {
        String arr[]=s.split(" ");
        LinkedHashMap<String,Integer>mpp=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        int maxi=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> n:mpp.entrySet()){
            maxi=Math.max(maxi,n.getValue());
        }
        for (Map.Entry<String,Integer> e : mpp.entrySet()) {
            if (e.getValue() == maxi) {
                return e.getKey() + " " + e.getValue();
            }
        }
        return " ";
    }
}
