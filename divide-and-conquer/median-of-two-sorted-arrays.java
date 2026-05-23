class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        for(int i = 0; i < n1; i++){
            merged[i] = nums1[i];
        }
        for(int i = 0; i < n2; i++){
            merged[n1 + i] = nums2[i];
        }
        int n = merged.length;
                for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(merged[j] > merged[j+1]){
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
        }
        if(n % 2 == 0){
            return (merged[n/2 - 1] + merged[n/2]) / 2.0;
        } else {
            return merged[n/2];
        }
    }
}