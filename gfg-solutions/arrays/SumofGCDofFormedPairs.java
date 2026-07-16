import java.util.Arrays;

public class SumofGCDofFormedPairs {
  public long gcdSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int maxi=nums[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            int val=findgcd(nums[i],maxi);
            arr[i]=val;
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<right){
            ans+=findgcd(arr[left],arr[right]);
            left++;
            right--;
        }
        return ans;
    }
    public static int findgcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
