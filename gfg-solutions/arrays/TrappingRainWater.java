class TrappingRainWater {
  public int maxWater(int arr[]) {
        // code here
        int prefix[]=new int[arr.length];
        int suffix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=Math.max(arr[i],prefix[i-1]);
        }
        suffix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suffix[i]=Math.max(arr[i],suffix[i+1]);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+Math.min(prefix[i],suffix[i])-arr[i];
        }
        return ans;
    }
}