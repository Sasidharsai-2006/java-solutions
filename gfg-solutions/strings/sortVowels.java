import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
class pair{
    char ch;
    int val;
    pair(char ch,int val){
        this.ch=ch;
        this.val=val;
    }
 }
public class sortVowels {
  public String sortVowels(String s) {
        int n=s.length();
        Queue<Integer> pos=new LinkedList<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                pos.add(i);
            }
        }
        HashMap<Character,Integer> mpp=new HashMap<>();
        HashMap<Character,Integer> firstPos=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                mpp.put(ch,mpp.getOrDefault(ch,0)+1);
                firstPos.putIfAbsent(ch, i);
            }
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            if(b.val != a.val) return b.val - a.val;
            return firstPos.get(a.ch) - firstPos.get(b.ch); 
        });
        for(Map.Entry<Character,Integer> ent :mpp.entrySet()){
            char keyy=ent.getKey();
            int vall=ent.getValue();
            pq.add(new pair(keyy,vall));
        }
        char[] result = new char[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' ){
                result[i]=ch;
            }
        }
        while(!pq.isEmpty()){
            pair high=pq.poll();
            int val=high.val;
            while(val>0){
                int index=pos.poll();
                result[index]=high.ch;
                val--;
            }
        }
       return new String(result);
    }
}
