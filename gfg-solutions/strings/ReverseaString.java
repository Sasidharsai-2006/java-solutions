public class ReverseaString {
  public static String reverseString(String s) {
        // code here
        int left=0;
        StringBuilder sb = new StringBuilder(s);
        int right=sb.length()-1;
        while(left<=right){
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}
