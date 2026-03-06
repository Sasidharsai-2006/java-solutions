class SmallestWindowContainingAllCharacters {
  public static String minWindow(String s, String p) {
        int n=s.length();
        int m=p.length();
        if(m>n)return "";
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=p.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        int l=0;
        int r=0;
        int count=0;
        int startindx=-1;
        int minlen=Integer.MAX_VALUE;
        while(r<n){
            char ch=s.charAt(r);
            if(mpp.containsKey(ch)){
            mpp.put(ch,mpp.get(ch)-1);
            if(mpp.get(ch)>=0){
                count++;
            }
        }
            while(count==m){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    startindx=l;
                }
                char ch1=s.charAt(l);
                if(mpp.containsKey(ch1)){
                    mpp.put(ch1,mpp.get(ch1)+1);
                    if(mpp.get(ch1)>0){
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
       return (startindx == -1) ? "" : s.substring(startindx, startindx + minlen);
    }
}