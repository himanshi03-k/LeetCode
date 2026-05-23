class Solution {
    public int jump(int[] nums) {
        int current=0; 
        int hmax=0; 
        int jumps=0;
        for(int i=0; i<nums.length-1; i++){
            hmax=Math.max(hmax, i+nums[i]);
            if(i==current){
                jumps++;
                current=hmax; 
            }
        }
        return jumps; 
        
    }
}