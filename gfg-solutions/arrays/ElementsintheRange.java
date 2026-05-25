class ElementsintheRange
{
    public boolean checkElements(int start, int end, int[] arr) {
        HashSet<Integer> ss=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ss.add(arr[i]);
        }
        for(int i=start;i<=end;i++){
            if(!ss.contains(i)){
                return false;
            }
        }
        return true;
    }
}