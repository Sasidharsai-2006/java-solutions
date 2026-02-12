import java.util.HashMap;

public class LongestSubstringwithKUniques {
  public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int n=s.length();
        int len=0;
        int l=0;
        for(int i=0;i<n;i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
            if(mpp.size()>k){
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l))==0){
                    mpp.remove(s.charAt(l));
                }
                l++;
            }
            if(mpp.size()==k){
                len=Math.max(len,i-l+1);
            }
            
        }
        if(len==0){
            return -1;
        }
        return len;
        
    }
}
