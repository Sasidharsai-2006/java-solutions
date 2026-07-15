class GCDofOddandEvenSums {
    public int gcdOfOddEvenSums(int n) {
        int evensum=0;
        int oddsum=0;
        int i=1;
        int j=2;
        for(int k=0;k<n;k++){
            oddsum+=i;
            evensum+=j;
            i+=2;
            j+=2;
        }
        int mini=Math.min(oddsum,evensum);
        for(int k=mini;k>0;k--){
            if(oddsum%k==0 && evensum%k==0){
                return k;
            }
        }
        return mini;
    }
}