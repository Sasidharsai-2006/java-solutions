class H-index{
  public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            int rem=n-i;
            if(citations[i]>=rem){
                return rem;
            }
        }
        return 0;
    }
}