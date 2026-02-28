import java.util.ArrayList;
import java.util.PriorityQueue;
class pair{
    int num1;
    int num2;
    int diff;
    pair(int num1,int num2,int diff){
        this.num1=num1;
        this.num2=num2;
        this.diff=diff;
    }
}
class Findtheclosestpairfromtwoarrays{
  public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.diff-b.diff);
        ArrayList<Integer> result=new ArrayList<>();
        int size1=arr1.length;
        int size2=arr2.length;
        int p1=0;
        int p2=size2-1;
        while(p1<size1 && p2>=0){
            int sum=arr1[p1]+arr2[p2];
            int diff = Math.abs(sum - x);
            pq.add(new pair(arr1[p1], arr2[p2], diff));
            if(sum>x){
                p2--;
            }
            else{
                p1++;
            }
        }
        if(pq.size()==0){
            result.add(-1);
            result.add(-1);
            return result;
        }
        pair ans=pq.poll();
        result.add(ans.num1);
        result.add(ans.num2);
        return result;
    }

}