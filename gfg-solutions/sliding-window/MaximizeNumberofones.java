public class MaximizeNumberofones{
  public int maxOnes(int arr[], int k) {
       int left=0;
       int right=0;
       int zeros=0;
       int maxlen=0;
       while(right<arr.length){
           if(zeros>k){
               if(arr[left]==0){
                   zeros--;
               }
               left++;
           }
           if(arr[right]==0){
               zeros++;
           }
           if(zeros<=k){
               int len=right-left+1;
               maxlen=Math.max(maxlen,len);
               
           }
           right++;
       }
       return maxlen;
        
    }
}
