import java.util.List;

public class MaximumAreaBetweenBars {
  public int maxArea(List<Integer> height) {
        // code here
        int left=0;
        int maxi=Integer.MIN_VALUE;
        int right=height.size()-1;
        while(left<right){
            int val1=height.get(left);
            int val2=height.get(right);
            int ans=Math.min(val1,val2);
            ans=ans*(right-left-1);
            maxi=Math.max(maxi,ans);
            if(val1<val2){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}
