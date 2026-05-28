public class FindClosestPerson {
   public int findClosest(int x, int y, int z) {
        int val1=Math.abs(z-x);
        int val2=Math.abs(z-y);
        if(val1==val2){
            return 0;
        }else if(val1<val2){
            return 1;
        }
        return 2;
    }
}
