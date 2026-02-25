import java.util.PriorityQueue;
class pair{
    int count;
    int num;
    pair(int count,int num){
        this.count=count;
        this.num=num;
    }
}
public class 1SortIntegersbyTheNumberofBits {
   public int[] sortByBits(int[] arr) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            if(a.count==b.count){
                return a.num-b.num;
            }
            return a.count-b.count;
        });
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=FindnoofOnes(arr[i]);
            pq.add(new pair(count,arr[i]));
        }
        int index=0;
        while(!pq.isEmpty()){
            pair top=pq.poll();
            ans[index]=top.num;
            index++;
        }
        return ans;
    }
    public static int FindnoofOnes(int num){
        String res=Integer.toBinaryString(num);
        int count=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
