package GFF-solutions.recursion;
import java.util.*;
public class ValidBinaryStringsWithCostLimit {
  public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        int index=0;
        StringBuilder sb=new StringBuilder();
        findans(index,sb,n,k,ans);
        return ans;
    }
    public static void findans(int index,StringBuilder sb,int n,int k,List<String>ans){
        if(index==n){
            int val=Findcost(sb);
            if(val<=k){
                ans.add(sb.toString());
            }
            return ;
        }
        sb.append('0');
        findans(index + 1, sb, n, k, ans);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length() == 0 || sb.charAt(sb.length() - 1) != '1') {
            sb.append('1');
            findans(index + 1, sb, n, k, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static int Findcost(StringBuilder sb){
        int res=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                res+=i;
            }
        }
        return res;
    }
}
