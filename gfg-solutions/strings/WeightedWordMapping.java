class WeightedWordMapping {
    public String mapWordWeights(String[] words, int[] weights) {
       ArrayList<Integer> arr=new ArrayList<>();
       StringBuilder sb=new StringBuilder();
        for(String str:words){
            arr.add(Findsum(str,weights));
        }
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i)%26;
            char ch = (char)('z' - val);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static int Findsum(String str,int[] weights ){
        int val=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            val+=weights[ch-'a'];
        }
        return val;
    }
}