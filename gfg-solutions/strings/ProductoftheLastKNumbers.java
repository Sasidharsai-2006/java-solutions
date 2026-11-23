class ProductOfTheLastKNumbers{
  ArrayList<Integer> arr;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
        
    }
    
    public int getProduct(int k) {
        int prod=1;
        for(int i=1;i<=k;i++){
            int ele=arr.get(arr.size()-i);
            prod=prod*ele;
        }
        return prod;
    }
}