class ReplacewithXORofAdjacent {
     public void replaceElements(int[] arr) {
        // code here
        int n=arr.length;
        int help[]=new int[arr.length];
        help[0] = arr[0] ^ arr[1];
        help[n-1]=arr[n-2] ^ arr[n-1];
        for(int i=1;i<=n-2;i++){
            help[i]= arr[i-1] ^ arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=help[i];
        }
    }
}