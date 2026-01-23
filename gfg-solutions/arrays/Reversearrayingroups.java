import java.util.ArrayList;
public class Reversearrayingroups {
   void reverseInGroups(ArrayList<Long> arr, int k) {
        int arr1[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr1[i] = arr.get(i).intValue();
        }
        for (int start = 0; start < arr1.length; start += k) {
            int i = start;
            int j = Math.min(start + k - 1, arr1.length - 1); 
            while (i < j) {
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr.set(i, (long) arr1[i]); 
        }
    }
}
