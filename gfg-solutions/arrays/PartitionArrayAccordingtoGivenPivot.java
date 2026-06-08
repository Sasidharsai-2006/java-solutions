import java.util.ArrayList;

public class PartitionArrayAccordingtoGivenPivot {
  public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lower=new ArrayList<>();
        ArrayList<Integer> middle=new ArrayList<>();
        ArrayList<Integer> higher=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                lower.add(nums[i]);
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                middle.add(nums[i]);
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                higher.add(nums[i]);
            }
        }
        int index=0;
        for(int val:lower){
            nums[index]=val;
            index++;
        }
        for(int val:middle){
            nums[index]=val;
            index++;
        }
        for(int val:higher){
            nums[index]=val;
            index++;
        }
        return nums;
    }
  
}
