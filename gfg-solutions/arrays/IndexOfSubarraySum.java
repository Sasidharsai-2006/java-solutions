import java.util.ArrayList;
import java.util.List;
public class IndexOfSubarraySum {
  static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        int left=0,sum=0;
        for(int right=0;right<n;right++){
            sum=sum+arr[right];
            while(sum>target && left<=right){
                sum=sum-arr[left];
                left++;
            }
            if(sum==target){
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
      }
      return new ArrayList<>(List.of(-1));
    }
}
