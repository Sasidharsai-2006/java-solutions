class Pairswithcertaindifference
{
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans=0;
        while(!pq.isEmpty() && pq.size()>=2){
            int val1=pq.poll();
            int val2=pq.poll();
            int diff=Math.abs(val1-val2);
            if(diff<k){
                ans+=(val1+val2);
            }
            else{
                pq.add(val2);
            }
        }
        return ans;
    }
}