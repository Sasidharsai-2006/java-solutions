import java.util.Arrays;

public class FormtheLargestNumber {
  public String findLargest(int[] arr) {
        // code here
        String ans[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(ans,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        if(ans[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String str:ans){
            sb.append(str);
        }
        return sb.toString();
    }
}
