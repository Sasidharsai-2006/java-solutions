import java.util.HashMap;
import java.util.Map;
class TwiceCounter {
   public int countWords(String list[], int n) {
        HashMap<String,Integer> mpp=new HashMap<>();
        for(int i=0;i<list.length;i++){
            mpp.put(list[i],mpp.getOrDefault(list[i],0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> rec:mpp.entrySet()){
            if(rec.getValue()==2){
                count++;
            }
        }
        return count;
    }
}