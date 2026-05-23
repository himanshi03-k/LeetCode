class Solution {
    public int missingNumber(int[] nums) {
        int ans; 
        int total=0;
        int sum=0; 
        int n=nums.length;
        sum=n*(n+1)/2; 
        for(int i=0; i<nums.length; i++){
            total+=nums[i]; 
        }
        ans= sum-total; 
        return ans ; 
    }
}