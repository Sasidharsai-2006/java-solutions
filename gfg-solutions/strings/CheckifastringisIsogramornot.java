public class CheckifastringisIsogramornot {
   static boolean isIsogram(String data) {
        int n=data.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=data.charAt(i);
            freq[ch-'a']++;
        }
        for(int c:freq){
            if(c>1){
                return false;
            }
        }
        return true;
    }
}
