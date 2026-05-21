class longestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefix=new HashSet<>();
        for(int num:arr1){
            int x=num;
            while(x!=0){
                prefix.add(x);
                x=x/10;
            }
        }
        int ans=0;
        for(int num:arr2){
            int x=num;
            int len=digits(num);
            while(x!=0){
                if(prefix.contains(x)){
                    ans=Math.max(ans,len);
                    break;
                }
                x=x/10;
                len--;
            }
        }
        return ans;
        
    }
    public int digits(int x) {
        int cnt = 0;
        while(x > 0) {
            cnt++;
            x /= 10;
        }
        return cnt;
    }
}