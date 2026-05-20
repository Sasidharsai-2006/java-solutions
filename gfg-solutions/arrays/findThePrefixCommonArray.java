class findThePrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int ans[]=new int[n];
        if(n==1){
            if(A[0]==B[0]){
                ans[0]=1;
                return ans;
            }
        }
        HashMap<Integer,Integer> mpp1=new HashMap<>();
        HashMap<Integer,Integer> mpp2=new HashMap<>();
        for(int i=0;i<n;i++){
          mpp1.put(A[i],mpp1.getOrDefault(A[i],0)+1);
          mpp2.put(B[i],mpp2.getOrDefault(B[i],0)+1);
            int val=checkthecommon(mpp1,mpp2);
            ans[i]=val;
        }
        return ans;
    }
    public static int checkthecommon(HashMap<Integer,Integer> mpp1,HashMap<Integer,Integer> mpp2){
        int ans=0;
        for(Map.Entry<Integer,Integer> ent:mpp1.entrySet()){
            int key=ent.getKey();
            ans+=mpp2.getOrDefault(key,0);
        }
        return ans;
    }
}