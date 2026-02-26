import java.util.HashMap;
import java.util.Map; 
import java.util.PriorityQueue;
class Pair {
    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}
public class SortCharactersByFrequency {
  public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(Map.Entry<Character,Integer> pairr :mpp.entrySet()){
            pq.add(new Pair(pairr.getKey(),pairr.getValue()));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            char key=p.ch;
            int val=p.freq;
            while(val>0){
                sb.append(key);
                val--;
            }
        }
        return sb.toString();        
    }
}
