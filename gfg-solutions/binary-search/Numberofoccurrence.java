class Numberofoccurrence{
  int countFreq(int[] arr, int target) {
        // code here
        if(firstoccur(arr,target)==-1 ){
            return 0;
        }
        return lastocuur(arr,target)-firstoccur(arr,target)+1;
    }
     public static int firstoccur(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int lastocuur(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}