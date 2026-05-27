class CounttheNumberofSpecialCharactersII {
     public int numberOfSpecialChars(String word) {
       HashMap<Character,Integer> lower=new HashMap<>();
       HashMap<Character,Integer> upper=new HashMap<>();
       int count=0;
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(ch>='a' && ch<='z'){
            lower.put(ch,i);
        }
        else{
            if(!upper.containsKey(ch)){
                upper.put(ch,i);
            }
        }
       }
       for(Map.Entry<Character,Integer> ent:lower.entrySet()){
          char ch=ent.getKey();
          int val1=ent.getValue();
          char upperc=Character.toUpperCase(ch);
          if(upper.containsKey(upperc)){
            int val2=upper.get(upperc);
            if(val1<val2){
                count++;
            }
          }
       }
       return count;
    }
}