import java.util.HashMap;

public class Longestsubstringwithditinctcharacters {
  public int longestUniqueSubstr(String s) {
        int n=s.length();
       HashMap<Character,Integer> mpp=new HashMap<>();
       int l=0;
       int r=0;
       int maxlen=Integer.MIN_VALUE;
       while(r<n){
           char ch=s.charAt(r);
           if(mpp.containsKey(ch)){
               while(mpp.containsKey(ch)){
                   char ch1=s.charAt(l);
                   mpp.put(ch1,mpp.get(ch1)-1);
                   if(mpp.get(ch1)==0){
                       mpp.remove(ch1);
                   }
                   l++;
               }
           }
           maxlen=Math.max(maxlen,r-l+1);
           mpp.put(s.charAt(r),1);
           r++;
       }
       return maxlen;
    }
}
