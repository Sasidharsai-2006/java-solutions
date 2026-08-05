class SubarrayswithSuminRange{
   public int countSubarray(int[] arr, int l, int r) {
        // code here
        return Findans(arr,r)-Findans(arr,l-1);
        
    }
    public static int Findans(int arr[],int target){
         if (target < 0) {
            return 0;
        }
        int n=arr.length;
        int count=0;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
             while (sum > target) {
                sum -= arr[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}