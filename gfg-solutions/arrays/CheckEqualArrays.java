import java.util.HashMap;

public class CheckEqualArrays {
   public static boolean checkEqual(int[] a, int[] b) {
        if(a.length!=b.length){
            return false;
        }
        HashMap<Integer,Integer> mpp1=new HashMap<>();
        HashMap<Integer,Integer> mpp2=new HashMap<>();
        for(int i=0;i<a.length;i++){
            mpp1.put(a[i],mpp1.getOrDefault(a[i],0)+1);
            mpp2.put(b[i],mpp2.getOrDefault(b[i],0)+1);
            
        }
        if(mpp1.equals(mpp2))
        return true;
        else
        return false;
    }
}
