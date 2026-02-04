import java.util.*;
class FirstNegativeInEveryWindowOfSizeK {
  static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            if(arr[i]<0){
                dq.offerLast(i);
            }
            if(i>=k-1){
                if(!dq.isEmpty()){
                    ans.add(arr[dq.peekFirst()]);
                }
                else{
                    ans.add(0);
                }
            }
            
        }
        return ans;
    }
}