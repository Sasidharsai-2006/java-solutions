class DestroyingAsteroids {
   public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       long val=mass;
       for(int i=0;i<asteroids.length;i++){
        pq.add(asteroids[i]);
       }
       while(!pq.isEmpty()){
        int las=pq.poll();
        if(val>=las){
            val+=las;
        }
        else{
            return false;
        }
      }
      return true;
    }
}