class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int x : nums) {
            String temp = x+"";
            if(temp.length()%2==0) count++;
        }
        return count;
    }
}