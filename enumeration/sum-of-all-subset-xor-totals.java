class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int res=0;
        generateSubarray(nums,0,new ArrayList<>(),subsets);
        for(List<Integer> subset : subsets) {
            int xor=0;
            for(int n : subset) {
                xor ^= n;
            }
            res += xor;
        }
        return res;
    }
    void generateSubarray(int nums[], int i, List<Integer> subset, List<List<Integer>> subsets) {
        if(i==nums.length) {
            subsets.add(new ArrayList<>(subset));
            return ;
        }
        subset.add(nums[i]);
        generateSubarray(nums,i+1,subset,subsets);
        subset.remove(subset.size()-1);
        generateSubarray(nums,i+1,subset,subsets);
    }
}