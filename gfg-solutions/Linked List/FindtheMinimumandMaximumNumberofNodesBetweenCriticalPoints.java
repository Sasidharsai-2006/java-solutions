class FindMinimumandMaximumNumberofNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> criticalpoints=new ArrayList<>();
        ListNode temp=head;
        int result[]=new int[2];
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }     
        for(int i=1;i<arr.size()-1;i++){
            int prev=arr.get(i-1);
            int curr=arr.get(i);
            int next=arr.get(i+1);
            if(prev >curr && curr<next){
                criticalpoints.add(i+1);
            }
            if(curr>prev && next <curr){
                criticalpoints.add(i+1);
            }
        }
        int mindist=Integer.MAX_VALUE;
        int maxdist=Integer.MIN_VALUE;
         if(criticalpoints.size() < 2) {
            return new int[]{-1, -1};
        }
        int val1=criticalpoints.get(criticalpoints.size()-1)-criticalpoints.get(0);
        maxdist=Math.max(maxdist,val1);
        int left=0;
        int right=1;
        while(right<criticalpoints.size()){
            int val2=criticalpoints.get(right)-criticalpoints.get(left);
            mindist=Math.min(mindist,val2);
            right++;
            left++;
        }
        result[0]=mindist;
        result[1]=maxdist;
        return result;
    }
} 