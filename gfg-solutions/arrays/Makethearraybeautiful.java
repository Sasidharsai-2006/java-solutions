class Makethearraybeautiful {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!st.isEmpty() &&
               ((st.peek() >= 0 && arr[i] < 0) ||
                (st.peek() < 0 && arr[i] >= 0))) {
                st.pop();
            }
            else {
                st.push(arr[i]);
            }
        }
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}