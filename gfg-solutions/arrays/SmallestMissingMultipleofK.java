import java.util.HashSet;

public class SmallestMissingMultipleofK {
  public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ss.add(nums[i]);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int val=k*i;
            if(!ss.contains(val)){
                return val;
            }
        }
        return Integer.MAX_VALUE;
    }
  
}
