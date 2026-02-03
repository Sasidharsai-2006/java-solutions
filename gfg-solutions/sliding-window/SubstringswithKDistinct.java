import java.util.HashMap;
public class SubstringswithKDistinct {
  int countSubstr(String s, int k) {
        int ans1=atmostk(s,k);
        int ans2=atmostk(s,k-1);
        return ans1-ans2;
    }
    public static int atmostk(String s,int k){
        HashMap<Character,Integer> mpp=new HashMap<>();
        int left=0;
        int count=0;
        int right=0;
        while(right<s.length()){
            mpp.put(s.charAt(right),mpp.getOrDefault(s.charAt(right),0)+1);
            while(mpp.size()>k){
                mpp.put(s.charAt(left),mpp.get(s.charAt(left))-1);
                if(mpp.get(s.charAt(left))==0){
                    mpp.remove(s.charAt(left));
                }
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
        
    }
}
