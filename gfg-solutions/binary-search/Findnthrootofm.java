class Findnthrootofm {
    public int nthRoot(int n, int m) {
        int low=0;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int val=Findtheroot(mid,n,m);
            if(val==1){
                return mid;
            }
            else if(val==2){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return -1;
        
    }
    public static int Findtheroot(int mid,int n,int m){
        int sum=1;
        for(int i=0;i<n;i++){
            sum=sum*mid;
            if(sum>m){
                return 2;
            }
        }
        if(sum==m) return 1;
        return 0;
    }
} 