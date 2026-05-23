class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        return (int)Math.pow(Math.min(maxSpan(hBars), maxSpan(vBars)), 2);
    }

    private int maxSpan(int[] bars) {
        int res = 1;
        int streak = 1;
        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                streak++;
                continue;
            }
            res = Math.max(res, ++streak);
            streak = 1;
        }
        return Math.max(res, ++streak);
    }
}
