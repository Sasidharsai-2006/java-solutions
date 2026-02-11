import java.util.HashMap;
public class Substringsoflengthkwithdistinctelements {
  public int substrCount(String s, int k) {
        // code here
        HashMap<Character,Integer> mpp=new HashMap<>();
        int l=0;
        int count=0;
        int r=0;
        while(r<k){
            char ch=s.charAt(r);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            r++;
        }
        if(mpp.size()==k-1){
            count++;
        }
        while(r<s.length()){
            char ch=s.charAt(l);
            mpp.put(ch,mpp.get(ch)-1);
            if(mpp.get(ch)==0){
                mpp.remove(ch);
            }
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            if(mpp.size()==k-1){
            count++;
          }
          l++;
          r++;
        }
        return count;
    }
}
