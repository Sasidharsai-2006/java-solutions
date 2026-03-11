public class Countofcamelcasecharacters {
   int countCamelCase(String s) {
        // your code here
         int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch >= 65 && ch <= 91){
                cnt++;
            }
        }
        return cnt;
    }
}
