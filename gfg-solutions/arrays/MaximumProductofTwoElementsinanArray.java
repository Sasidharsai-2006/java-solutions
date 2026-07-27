class MaximumProductofTwoElementsinanArray{
  public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int x=pq.poll();
        int y=pq.poll();
        return (x-1)*(y-1);
    }
}