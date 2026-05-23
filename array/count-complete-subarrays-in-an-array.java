class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int res=0;
        Map<Integer,Integer> count = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int right=0;
        for(int num : nums) {
            if(!set.contains(num)) {
                set.add(num);
            }
        }
        int distinct = set.size();
        for(int left=0; left<n; left++) {
            if(left>0) {
                int remove = nums[left-1];
                count.put(remove,count.get(remove)-1);
                if(count.get(remove)==0) count.remove(remove);
            }
            while(right < n && count.size()<distinct) {
                int add = nums[right];
                count.put(add,count.getOrDefault(add,0)+1);
                right++;
            }
            if(count.size()==distinct) res+=(n-right+1);
        }
        return res;
    }
}