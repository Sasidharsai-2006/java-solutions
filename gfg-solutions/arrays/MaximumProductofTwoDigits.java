import java.util.ArrayList;
import java.util.Collections;

class MaximumProductofTwoDigits{
  public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int digit=n%10;
            arr.add(digit);
            n=n/10;
        }
        Collections.sort(arr);
        int left=0;
        int right=arr.size()-1;
        int ans=0;
        while(left<right){
            ans=Math.max(ans,(arr.get(left)*arr.get(right)));
            left++;
        }
        return ans;
    }
}