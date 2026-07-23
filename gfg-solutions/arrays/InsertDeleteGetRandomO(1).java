class InsertDeleteGetRandomO(1){

}HashMap<Integer,Integer> mpp;
    ArrayList<Integer> arr;
    Random rand;
    public RandomizedSet() {
        mpp=new HashMap<>();
        arr=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(mpp.containsKey(val)){
            return false;
        }
        if(!arr.contains(val)){
            arr.add(val);
        }
        mpp.put(val,arr.size()-1);
        return true;
    }
    public boolean remove(int val) {
        if(!mpp.containsKey(val)){
            return false;
        }
        int index=mpp.get(val);
        int lastele=arr.get(arr.size()-1);
        arr.set(index,lastele);
        mpp.put(lastele,index);
        arr.remove(arr.size() - 1);
        mpp.remove(val);
        return true;
        
    }
    
    public int getRandom() {
       int index=rand.nextInt(arr.size());
       return arr.get(index);
    }