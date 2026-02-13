public class StringRotatedby2Places {
  public static boolean isRotated(String s1, String s2) {
        if(s1.length()==1){
            return false;
        }
        String s11=s1.substring(0,2);
        String s12=s1.substring(2,s1.length());
        String leftrot=s12+s11;
        if(leftrot.equals(s2)){
            return true;
        }
        String s21=s1.substring(0,s1.length()-2);
        String s22=s1.substring(s1.length()-2,s1.length());
        String rightrot=s22+s21;
        if(rightrot.equals(s2)){
            return true;
        }
        return false;
    }
}
