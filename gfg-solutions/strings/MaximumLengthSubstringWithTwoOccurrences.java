class MaximumLengthSubstringWithTwoOccurrences {
  public int maximumLengthSubstring(String s) {
        int ans=Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++){
        int arr[]=new int[26];
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            arr[ch-'a']++;
            if(ispossible(arr)){
                ans=Math.max(ans,j-i+1);
            }
        }
       }
       return ans;
    }
    public static boolean ispossible(int arr[]){
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]>2){
                return false;
            }
        }
        return true;
    }

}