class Solution {
    public int maxSubArray(int[] nums) {
            int curr_sum=0;
        int max_value= Integer.MIN_VALUE; 
        for(int i=0; i<nums.length; i++){
         curr_sum+=nums[i]; 
         max_value=Math.max(max_value , curr_sum);
         if(curr_sum<0){
            curr_sum=0; 
         }
        
 
    }
    return max_value; 
}
}