import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Checkiffrequenciescanbeequal {
   boolean sameFreq(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:mpp.values()){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        if(freq.size()==1){
            return true;
        }
        if(freq.size()>2){
            return false;
        }
        List<Integer> ans=new ArrayList<>(freq.keySet());
        int f1=ans.get(0);
        int f2=ans.get(1);
        if((f1==1 && freq.get(f1)==1) || (f2==1 && freq.get(f2)==1)) {
            return true;
        }
        if(Math.abs(f1-f2)==1){
            if((f1>f2 && freq.get(f1)==1) || (f2>f1 && freq.get(f2)==1)){
                return true;
            }
        }
        return false;
    }
}
