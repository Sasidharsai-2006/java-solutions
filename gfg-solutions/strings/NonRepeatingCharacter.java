import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {
  public char nonRepeatingChar(String s) {
        int n=s.length();
        LinkedHashMap<Character,Integer> mpp=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> ss :mpp.entrySet()){
            if(ss.getValue()==1){
                return ss.getKey();
            }
        }
        return '$';
    }
}
