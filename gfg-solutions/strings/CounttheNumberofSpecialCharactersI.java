class CountNumberofSpecialCharactersI
{
     public int numberOfSpecialChars(String word) {
        int ans=0;
        HashSet<Character> small=new HashSet<>();
        HashSet<Character> cap=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                small.add(ch);
            }
            if(ch>='A' && ch<='Z'){
                cap.add(ch);
            }
        }
        for(char chh:cap){
            char lower=Character.toLowerCase(chh);
            if(small.contains(lower)){
                ans++;
            }
        }
        return ans;
        
    }
}