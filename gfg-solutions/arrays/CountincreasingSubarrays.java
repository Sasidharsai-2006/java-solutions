class CountingIncreasingSubarrays {
   public int countIncreasing(int[] arr) {
        // code here
        int left = 0;
        int right = 1;
        int n = arr.length;
        int result = 0;
        while(right < n){
            if(arr[right-1] < arr[right]){
                right++;
            }
            else{
                int len = right - left;
                if(len >= 2){
                    result += (len*(len-1))/2;
                }
                left = right;
                right++;
            }
        }
        int len = right - left;
        if(len >= 2){
            result += (len*(len-1))/2;
        }
        return result;
    }
}