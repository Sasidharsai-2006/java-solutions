class MirrorFrequency {
  public int mirrorFrequency(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        int ans=0;
        HashSet<Character> visited = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char org=s.charAt(i);
            if(visited.contains(org)) {
                continue;
            }
            char mirror;
            if(org>='a' && org<='z'){
               mirror = (char) ('z' - (s.charAt(i) - 'a'));
            }
            else{
              mirror = (char) ('9' - (s.charAt(i) - '0'));
            }
            int freq1=mpp.getOrDefault(org,0);
            int freq2=mpp.getOrDefault(mirror,0);
            ans += Math.abs(freq1 - freq2);
            visited.add(org);
            visited.add(mirror);

        }
        return ans;
    }
}