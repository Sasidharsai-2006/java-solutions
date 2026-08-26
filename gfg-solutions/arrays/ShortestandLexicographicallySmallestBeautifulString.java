public class ShortestandLexicographicallySmallestBeautifulString {
  public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int onecount=0;
        int minlen = Integer.MAX_VALUE;
        String ans = "";
        while(right<n){
            char ch=s.charAt(right);
            if(ch=='1'){
                onecount++;
            }
            while (onecount > k) {
                if (s.charAt(left) == '1') {
                    onecount--;
                }
                left++;
            }
            if(onecount==k){
                while(s.charAt(left)=='0'){
                    left++;
                }
                int len=right-left+1;
                String current =s.substring(left,right+1);
                if (len < minlen) {
                    minlen = len;
                    ans = current;
                }
                else if(len==minlen && current.compareTo(ans) < 0){
                    ans=current;
                }
            }
            right++;
        }
        return ans;
    }
}
