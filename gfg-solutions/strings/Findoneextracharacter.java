public class Findoneextracharacter {
  public static char extraChar(String s1, String s2) {
        int count[]=new int[26];
        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]==1){
                return (char)(i+'a');
            }
        }
         return 0;
    }
}
