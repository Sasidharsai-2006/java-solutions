public class Rowwithmax1s {
  public int rowWithMax1s(int arr[][]) {
        // code here
        int maxrow=-1;
        int maxval=-1;
        for(int i=0;i<arr.length;i++){
            int val=firstoccur(arr[i]);
            if(val!=-1){
            if(val<maxval || maxval == -1){
                maxval=val;
                maxrow=i;
            }
          }
        }
        return maxrow;
    }
    public static int firstoccur(int arr1[]){
        int first=-1;
        int low=0;
        int high=arr1.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr1[mid]==1){
                first=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return first;
    }
}
