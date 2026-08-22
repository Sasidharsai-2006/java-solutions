class CheckDivisibilitybyDigitSumandProduct{
  public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int product=1;  
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        int totoal=sum+product;
        if(org%totoal==0){
            return true;
        }
        return false;
    }
}