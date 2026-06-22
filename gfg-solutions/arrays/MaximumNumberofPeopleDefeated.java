class MaximumNumberofPeopleDefeated {
    int maxPeopleDefeated(int p) {
        // code here
        int count=0;
        for(int i=1;i<=p;i++){
            if((i*i)<=p){
                p=p-(i*i);
                count++;
            }
            else{
                break;
            }
        }
        
        return count;
    }
}