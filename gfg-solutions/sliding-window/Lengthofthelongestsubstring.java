import java.util.HashMap;
public class Lengthofthelongestsubstring {
  int longestUniqueSubstring(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length()){
            if(mpp.containsKey(s.charAt(right))){
                left=Math.max(left,mpp.get(s.charAt(right))+1);
            }
            mpp.put(s.charAt(right),right);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
      return maxlen;
    }
}
