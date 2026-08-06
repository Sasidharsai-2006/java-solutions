class SmallestDivisibleDigitProductI{
  public int smallestNumber(int n, int t) {
        for(int i=n;i<Integer.MAX_VALUE;i++){
            if(ispossible(i,t)){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static boolean ispossible(int n,int t){
        int sum=1;
        while(n!=0){
            int digit=n%10;
            sum*=digit;
            n=n/10;
        }
        if(sum % t==0){
            return true;
        }
        return false;
    }
}