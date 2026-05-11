import java.util.ArrayList;
import java.util.List;

public class ValisElements {
  public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        int prev[]=new int[n];
        int next[]=new int[n];
        List<Integer> ans=new ArrayList<>();
        if(n==1){
            ans.add(nums[0]);
            return ans;
        }
        prev[0]=nums[0];
        for(int i=1;i<n;i++){
            prev[i]=Math.max(prev[i-1],nums[i]);
        }
        next[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            next[i]=Math.max(nums[i],next[i+1]);
        }
        ans.add(nums[0]);
        for(int i=1;i<n-1;i++){
            int val=nums[i];
            if(prev[i-1]<val || next[i+1]<val){
                ans.add(nums[i]);
            }
        }
        ans.add(nums[n-1]);
        return ans;
    }
}
