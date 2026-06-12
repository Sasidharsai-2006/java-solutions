import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CheckRepeatedSubstringwithKReplacements {
    public boolean kSubstr(String s, int k) {
        // code here
        if(s.length() % k != 0){
            return false;
        }
        int start=0;
        int end=k;
        HashMap<String,Integer> mpp=new HashMap<>();
        while(end<=s.length()){
            String sub=s.substring(start,end);
            start=end;
            end=end+k;
            mpp.put(sub,mpp.getOrDefault(sub,0)+1);
        }
         int blocks = s.length() / k;
        if(mpp.size()==1){
            return true;
        }
        if(blocks == 2 && mpp.size() == 2){
            return true;
        }
        if(mpp.size() > 2){
            return false;
        }
        ArrayList<Integer> ss=new ArrayList<>();
        for(Map.Entry<String,Integer> ent:mpp.entrySet()){
            ss.add(ent.getValue());
        } 
         int f1 = ss.get(0);
        int f2 = ss.get(1);
        if(f1 == 1 || f2 == 1){
            return true;
        }

        return false;
    }
}