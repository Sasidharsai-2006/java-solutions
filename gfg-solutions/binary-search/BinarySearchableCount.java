class BinarySearchableCount {
   public int binarySearchable(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Canbebinarysearchable(arr,arr[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean Canbebinarysearchable(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<=target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}