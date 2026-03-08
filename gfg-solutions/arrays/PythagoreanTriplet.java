import java.util.HashSet;

public class  PythagoreanTriplet {
  boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ss.add(arr[i]);
        }
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<n;j++){
               int val = arr[i]*arr[i] + arr[j]*arr[j];
                int root = (int)Math.sqrt(val);
                if(root*root == val && ss.contains(root)){
                    return true;
                }
           }
        }
        return false;
    }
}
