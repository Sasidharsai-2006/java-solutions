class MinimumCostofBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<cost.length;i++){
            pq.add(cost[i]);
        }
        int count=0;
        int costt=0;
        while(!pq.isEmpty()){
            if(count==2){
                pq.poll();
                count=0;
            }
            else{
                costt+=pq.poll();
                count++;
            }
        }
        return costt;
    }
}