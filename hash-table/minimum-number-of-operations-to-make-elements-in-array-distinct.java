class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length, ans=0;
        for(int i=0; i<n; i+=3) {
            if(isUnique(nums,i)) break;
            else ans++;
        }
        return ans;
    }
    public boolean isUnique(int nums[], int n) {
        Set<Integer> set = new HashSet<>();
        for(int i=n; i<nums.length; i++) {
            if(set.contains(nums[i])) return false;
            set.add(nums[i]);
        }
        return true;
    }
}