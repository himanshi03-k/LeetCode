class Solution {
    public int removeDuplicates(int[] nums) {
        int size= nums.length; 
        for(int i=0; i<size-1; i++){
            if(nums[i]==nums[i+1]){
                for(int j=i; j<size-1; j++){
                    nums[j]=nums[j+1];
                }
                    size--; 
                    i--;
                
            
            }
        
    }
    return size; 
}
}
