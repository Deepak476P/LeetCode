class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // If reached index with value 0
            if (arr[i] == 0) {
                return true;
            }

            if (visited[i]) {
                continue;
            }

            visited[i] = true;

            // Forward jump
            int forward = i + arr[i];
            if (forward < n) {
                queue.offer(forward);
            }

            // Backward jump
            int backward = i - arr[i];
            if (backward >= 0) {
                queue.offer(backward);
            }
        }

        return false;
    }
}