public class Stringwithnumbersatitsend {
  int isSame(String s) {
        // code here
    int n = s.length();
	int alpha=0;
	int digit=0;

	for(int i=0; i<n; i++) {
	    char c = s.charAt(i);
	    if(!Character.isDigit(c)) {
	        alpha++;
	    } else {
	        digit=(digit*10)+c-'0';
	    }
	}
	 if(digit==alpha){
	     return 1;
	 }
	 return 0;
  }
}
