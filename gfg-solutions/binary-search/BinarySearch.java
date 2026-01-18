public class BinarySearch {
  public int binarysearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int ans=Integer.MAX_VALUE;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                 ans=Math.min(ans,mid);
                
            }
            if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}
