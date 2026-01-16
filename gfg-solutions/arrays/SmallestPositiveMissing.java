public class SmallestPositiveMissing {
  public int missingNumber(int[] arr) {
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ss.add(arr[i]);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!ss.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
