import java.util.ArrayList;
import java.util.HashMap;
class RangeLCMQueries {
    public ArrayList<Long> RangeLCMQuery(int[] arr, int[][] queries) {
        // code here
        ArrayList<Long> ans=new ArrayList<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(i,arr[i]);
        }
        for(int qu[]:queries){
            int first=qu[0];
            int second=qu[1];
            int thrid=qu[2];
            if(first==1){
                mpp.put(second,thrid);
            }
            else{
                long val=computeLcm(second,thrid,mpp);
                ans.add(val);
            }
        }
        return ans;
    }
    public static long computeLcm(int startidx,int endidx,HashMap<Integer,Integer> mpp){
        long lcm=mpp.get(startidx);
        for(int i=startidx+1;i<=endidx;i++){
             lcm = lcm(lcm, mpp.get(i));
        }
        return lcm;
    }
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static long gcd(long a, long b) {
        while(b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
} 