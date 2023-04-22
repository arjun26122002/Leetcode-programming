class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 != 0) {
                num *= 2;
            }
            pq.offer(num);
            min = Math.min(min, num);
        }
        int res = Integer.MAX_VALUE;
        while (true) {
            int max = pq.poll();
            res = Math.min(res, max - min);
            if (max % 2 == 0) {
                pq.offer(max / 2);
                min = Math.min(min, max / 2);
            } else {
                break;
            }
        }
        return res;
    }
}
