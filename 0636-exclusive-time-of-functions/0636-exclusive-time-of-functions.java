import java.util.*;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prev = 0;

        for (String log : logs) {

            String[] temp = log.split(":");

            int a = Integer.valueOf(temp[0]);
            String fun = temp[1];
            int time = Integer.valueOf(temp[2]);

            if (fun.equals("start")) {

                if (!stack.isEmpty()) {
                    arr[stack.peek()] += time - prev;
                }

                stack.push(a);
                prev = time;

            } else {

                arr[stack.pop()] += time - prev + 1;
                prev = time + 1;
            }
        }

        return arr;
    }
}