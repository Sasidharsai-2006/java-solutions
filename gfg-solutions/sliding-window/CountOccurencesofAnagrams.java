import java.util.HashMap;

public class CountOccurencesofAnagrams {
  int search(String pat, String txt) {
        // code here
        int count=0;
        HashMap<Character,Integer> mpp1=new HashMap<>();
        HashMap<Character,Integer> mpp2=new HashMap<>();
        for(int i=0;i<pat.length();i++){
            char ch=pat.charAt(i);
            mpp1.put(ch,mpp1.getOrDefault(ch,0)+1);
        }
        int k=pat.length();
        int l=0;
        int r=0;
        while(r<k){
            mpp2.put(txt.charAt(r),mpp2.getOrDefault(txt.charAt(r),0)+1);
            r++;
        }
        if(mpp2.equals(mpp1)){
            count++;
        }
        while(r<txt.length()){
            mpp2.put(txt.charAt(l),mpp2.get(txt.charAt(l))-1);
            if(mpp2.get(txt.charAt(l))==0){
                mpp2.remove(txt.charAt(l));
            }
            mpp2.put(txt.charAt(r),mpp2.getOrDefault(txt.charAt(r),0)+1);
            if(mpp2.equals(mpp1)){
            count++;
        }
        l++;
        r++;
        }
        return count;
    }
}
