class MaxXorSubarrayOfSizeK {
   public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int xor=0;
        int l=0;
        int r=0;
        while(r<k){
            xor=xor^arr[r];
            r++;
        }
        int maxi=xor;
        while(r<arr.length){
            xor=xor^arr[l];
            xor=xor^arr[r];
            maxi=Math.max(maxi,xor);
            l++;
            r++;
        }
        return maxi;
    }
}