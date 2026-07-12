class RankTransformofanArray {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=arr.length;
        if(n==0){
            return arr;
        }
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int count=1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int prev=pq.poll();
        mpp.put(prev,count);
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(prev!=curr){
                count++;
                mpp.put(curr,count);
                prev=curr;
            }
            else{
                mpp.put(curr,count);
                prev=curr;
            }
        }
        for(int i=0;i<n;i++){
           int rnk=mpp.get(arr[i]);
           arr[i]=rnk;
        }
        return arr;
    }
}