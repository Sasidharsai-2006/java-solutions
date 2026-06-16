class ProcessStringwithSpecialOperationsI {
  public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch=='#'){
                sb.append(sb);
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else{
                if(sb.length()>=1){
                sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}