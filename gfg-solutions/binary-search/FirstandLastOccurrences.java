import java.util.ArrayList;
public class FirstandLastOccurrences {
  ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans=new ArrayList<>();
        int first=firstoccurance(arr,x);
        if(first==-1){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int last=lastoccurance(arr,x);
        ans.add(first);
        ans.add(last);
        return ans;
        
    }
    public static int firstoccurance(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int lastoccurance(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
