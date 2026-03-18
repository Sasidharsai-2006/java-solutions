import java.util.Arrays;
import java.util.PriorityQueue;

class MinimumPlatforms {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
        int [][]acti=new int[n][2];
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            while(!pq.isEmpty() && pq.peek()<arr[i]){
                pq.poll();
            }
            pq.add(dep[i]);
            count=Math.max(count,pq.size());
        }
        return count;
    }
} 