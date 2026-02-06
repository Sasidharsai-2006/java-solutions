import java.util.*;
public class Countdistinctelementsineverywindow {
   ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0;
        int right=0;
        for(int i=0;i<k;i++){
            mpp.put(arr[right],mpp.getOrDefault(arr[right],0)+1);
            right++;
        }
        ans.add(mpp.size());
        for(int i=k;i<arr.length;i++){
            mpp.put(arr[left],mpp.get(arr[left])-1);
            if(mpp.get(arr[left])==0){
                mpp.remove(arr[left]);
            }
          mpp.put(arr[right],mpp.getOrDefault(arr[right],0)+1);
          ans.add(mpp.size());
          left++;
          right++;

        }
        return ans;
    }
}
