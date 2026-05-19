import java.util.*;
class getCommon
{
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            ss.add(nums1[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++){
            if(ss.contains(nums2[i])){
                ans=Math.min(ans,nums2[i]);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}