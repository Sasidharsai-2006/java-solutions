public class Peakelement {
   public int peakElement(int[] arr) {
        int n=arr.length;
        if(n==0){
            return -1;
        }
        int index=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
         if(index==0 || index==n-1){
             return index;
         }
        int left=index-1;
        int right=index+1;
         if ((left >= 0 && arr[left] < max) && (right < n && arr[right] < max)){
            return index;
        }
        return -1;
       
    }
}
