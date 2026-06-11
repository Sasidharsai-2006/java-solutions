class EqualPointinBrackets
{
    public int findIndex(String s) {
        int n = s.length();
        int[] rightClose = new int[n + 1];
        for(int i = n - 1; i >= 0; i--) {
            rightClose[i] = rightClose[i + 1];
            if(s.charAt(i) == ')') {
                rightClose[i]++;
            }
        }
        int leftOpen = 0;
        for(int i = 0; i <= n; i++) {
            if(leftOpen == rightClose[i]) {
                return i;
            }
            if(i < n && s.charAt(i) == '(') {
                leftOpen++;
            }
        }
        return n;
    }
}