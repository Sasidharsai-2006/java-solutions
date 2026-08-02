class StoneGame{
  public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int dp[][]=new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans=FindAns(0,n-1,piles,dp);
         return ans > 0;
    }
    public static int FindAns(int left,int right,int piles[],int dp[][]){
        if(left == right){
            return piles[left];
        }
        if(dp[left][right] != -1){
            return dp[left][right];
        }

        int takeleft=piles[left]-FindAns(left+1,right,piles,dp);

        int takeright=piles[right]-FindAns(left,right-1,piles,dp);
        return dp[left][right] = Math.max(takeleft, takeright);
    }
}