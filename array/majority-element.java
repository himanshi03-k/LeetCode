class Solution {
    public int majorityElement(int[] nums) {
        int count=0; 
        int cand=0; 
        int size=nums.length; 
        for(int i=0; i<size; i++){
            int num=nums[i];
            if(count==0){
                cand=num;
            }
            if(num==cand){
                count++;
            }
            else{
                count--;
            }
        }
        return cand; 
        
    }
}
