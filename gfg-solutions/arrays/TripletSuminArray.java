public class TripletSuminArray {
  public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}
