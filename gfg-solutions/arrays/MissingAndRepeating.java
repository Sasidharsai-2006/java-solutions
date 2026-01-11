import java.util.ArrayList; 
class MissingAndRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int missing=-1;
        int repeating=-1;
        int []hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                missing=i;
            }
            else if(hash[i]==2){
                repeating=i;
            }
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}