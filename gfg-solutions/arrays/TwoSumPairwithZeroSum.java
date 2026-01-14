import java.util.ArrayList;
import java.util.Arrays;

class TwoSumPairwithZeroSum{
  public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==0){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(arr[left]);
                temp.add(arr[right]);
                ans.add(temp);
                int currleft=arr[left];
                while(left<right && arr[left]==currleft){
                    left++;
                }
                int curright=arr[right];
                while(left<right && arr[right]==curright){
                    right--;
                }
            }
            else if(sum>0){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
}