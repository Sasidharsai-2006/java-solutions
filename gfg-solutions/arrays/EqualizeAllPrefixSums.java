class EualizeAllPrefixSums {
    public ArrayList<Integer> optimalArray(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        long curr=0;
        for(int i=1;i<arr.length;i++){
            curr += arr[i] - arr[i / 2];
            ans.add((int) curr);
        }
        return ans;
    }
}