public class UnionOfTwoSortedArrays {
  public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> ss=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ss.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ss.add(b[i]);
        }
         ArrayList<Integer> ans=new ArrayList<>(ss);
         return ans;
    }
}
