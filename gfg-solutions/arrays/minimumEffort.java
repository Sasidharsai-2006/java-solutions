class MinimumEffort {
  public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->
           (b[1] - b[0]) - (a[1] - a[0])
        );
        int total=0;
        for(int task[] :tasks){
            total+=task[1];
        }
        int low=0;
        int high=total;
        int ans=high;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canpossible(mid,tasks)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean canpossible(int target,int [][]tasks){
        for(int t[]:tasks){
            int energy=t[0];
            int minmum=t[1];
            if(target<minmum){
                return false;
            }
            target-=energy;
        }
        return true;
    }
}