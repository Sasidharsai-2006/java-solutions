package gfg-solutions.Stack;

public class SmallestSubsequenceofDistinctCharacters {
  public String smallestSubsequence(String s) {
        int n=s.length();
        boolean visited[]=new boolean[26];
        HashMap<Character,Integer> mpp=new HashMap<>();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            mpp.put(ch,i);
        }for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && mpp.get(st.peek())>i){
                char top = st.pop();
                visited[top - 'a'] = false;
            }
            st.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder ans=new StringBuilder();
         while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
