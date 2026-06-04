class TotalWavinessofNumbersinRangeI {
    public int totalWaviness(int num1, int num2) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            String s = String.valueOf(i);
            ans.add(s);
        }
        int answer=0;
        for(String val:ans){
            answer+=Findval(val);
        }
        return answer;
    }
    public static int Findval(String val){
        int res=0;
        for(int i=1;i<val.length()-1;i++){
            int left = val.charAt(i - 1) - '0';
            int mid  = val.charAt(i) - '0';
            int right = val.charAt(i + 1) - '0';
            if(mid>left && mid>right){
                res++;
            }
             if(mid<left && mid<right){
                res++;
            }
        }
        return res;
    }
}