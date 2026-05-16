class Notasubsetsum {
  public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int res = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > res) {
                return res;
            }
            res += arr[i];
        }
        return res;
    }
}