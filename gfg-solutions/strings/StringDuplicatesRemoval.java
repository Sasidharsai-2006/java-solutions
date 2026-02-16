import java.util.LinkedHashSet;
public class StringDuplicatesRemoval {
  String removeDuplicates(String s) {
        LinkedHashSet<Character> ss=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ss.add(ch);
        }
        StringBuilder ans=new StringBuilder();
        for(char ch :ss){
            ans.append(ch);
        }
        return ans.toString();
    }
}
