import java.util.Stack;

public class Lexicographicallysmallestafterremovingk {
  public String lexicographicallySmallest(String s, int k) {
        // code here
        int n=s.length();
        if((n & (n-1))==0){
            k=k/2;
        }
        else{
            k=k*2;
        }
        if(k>=n){
            return "-1";
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
         while(k > 0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}
