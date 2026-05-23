class Solution {
public:
    long long countSubarrays(vector<int>& nums, int k) {
       
        long long mx = INT_MIN;
        for(long long i = 0; i < nums.size(); i++) {
            if(nums[i] > mx) {
                mx = nums[i];
            }
        }

        long long i = 0;
        long long j = 0;
        long long count = 0;
        long long result = 0;

        while(j < nums.size()) {
            if(nums[j] == mx) {
                count++;
            }

            while(count >= k) {
                result += (nums.size() - j);
                if(nums[i] == mx) {
                    count--;
                }
                i++;
            }

            j++;
        }

        return result;
    }
};