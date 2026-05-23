class Solution {
    class SegmentTree {
        int[] tree;
        int size;
        SegmentTree(int n) {
            size = n;
            tree = new int[4*n];
        }
        void update(int index, int value,int node,int start,int end) {
            if (start == end) {
                tree[node] = Math.max(tree[node],value);
                return;
            }
            int mid = (start + end)/2;
            if (index <= mid) {
                update(index,value,2*node,start,mid);
            } else {
                update(index,value,2*node+1,mid+1,end);
            }
            tree[node] = Math.max(tree[2*node],tree[2*node+1]);
        }
        int query(int left, int right, int node, int start, int end) {
            if (right<start||end<left) return 0;
            if (left<=start && end<=right) {
                return tree[node];
            }
            int mid =(start + end)/2;
            return Math.max(
                query(left,right,2*node,start,mid),
                query(left,right,2*node+1,mid+1,end)
            );
        }
    }
    public int lengthOfLIS(int[] nums,int k) {
        int maxVal=0;
        for (int num : nums) {
            maxVal = Math.max(maxVal,num);
        }
        SegmentTree segTree = new SegmentTree(maxVal + 1);
        int ans = 1;
        for (int num : nums) {
            int left = Math.max(0,num - k);
            int right = num - 1;
            int best = 0;
            if (left<=right) {
                best = segTree.query(left, right, 1, 0, maxVal);
            }
            int curr=best+1;
            segTree.update(num,curr,1,0,maxVal);
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}