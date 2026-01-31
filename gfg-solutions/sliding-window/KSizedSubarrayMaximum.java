import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
public class KSizedSubarrayMaximum {
  public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }
}
