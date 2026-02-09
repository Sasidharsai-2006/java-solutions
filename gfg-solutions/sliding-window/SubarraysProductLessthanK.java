public class SubarraysProductLessthanK {
   public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        int l=0;
        long product=1;
        int r=0;
        long count=0;
        while(r<arr.length){
            product=product*arr[r];
            while(l<n && product>=k){
                product=product/arr[l];
                l++;
            }
            if(product<k){
            count=count+(r-l+1);
            }
            r++;
        }
        return count;
    }
}
