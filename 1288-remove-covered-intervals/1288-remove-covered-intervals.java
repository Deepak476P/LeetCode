class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            boolean covered = false;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (intervals[j][0] <= start &&
                    intervals[j][1] >= end) {
                    count++;
                    break;
                }
            }
        }

        return n - count;
    }
}