class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(n < k) return -1;
            else if(n > k) set.add(n);
        }
        return set.size();
    }
}