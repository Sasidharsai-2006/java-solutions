import java.util.ArrayList;
import java.util.HashMap;

public class CinemaSeatAllocation {
  public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,ArrayList<Integer>> mpp=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int arr[]=reservedSeats[i];
            int val1=arr[0];
            int val2=arr[1];
            if(mpp.containsKey(val1)){
                mpp.get(val1).add(val2);
            }
            else{
                mpp.put(val1,new ArrayList<>());
                mpp.get(val1).add(val2);
            }
        }
        int ans = (n - mpp.size()) * 2;
        for (int row : mpp.keySet()) {
            ArrayList<Integer> seats = mpp.get(row);
            boolean A = check(seats, 2, 5);
            boolean B = check(seats, 4, 7);
            boolean C = check(seats, 6, 9);

            if (A && C) {
                ans += 2;
            }
            else if (A || B || C) {
                ans += 1;
            }
        }
        return ans;
    }
    public static boolean check(ArrayList<Integer> seats, int start, int end) {

        for (int seat : seats) {

            if (seat >= start && seat <= end) {
                return false;
            }
        }

        return true;
    }
}
