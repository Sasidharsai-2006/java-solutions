class LastCoininaGameofAlternates {

  public int coin(int[] arr) {
        // code here
        if(arr.length==1){
            return arr[0];
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()!=1){
            pq.poll();
        }
        return pq.peek();
    }

}