import java.util.Arrays;
public class RearrangeArrayAlternately {
  public void rearrange(int arr[]) {
       int temp[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           temp[i]=arr[i];
       }
       int n=arr.length;
       Arrays.sort(temp);
       int index=0;
       int left=0;
       int right=n-1;
       while(left<=right){
          if(index<n) arr[index++]=temp[right--];
          if(index<n) arr[index++]=temp[left++];
       }
    }
}
