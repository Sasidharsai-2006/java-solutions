class MaximumIceCreamBars {
   public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<costs.length;i++){
            pq.add(costs[i]);
        }
        int count=0;
        while(!pq.isEmpty() && pq.peek()<=coins){
            coins-=pq.poll();
            count++;
        }
        return count;
    }
}