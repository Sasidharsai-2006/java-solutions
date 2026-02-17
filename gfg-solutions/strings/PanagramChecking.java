public class PanagramChecking {
  public static boolean checkPangram(String S) {
        S=S.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        for(int c:freq){
            if(c==0){
                return false;
            }
        }
        return true;
    }
}
