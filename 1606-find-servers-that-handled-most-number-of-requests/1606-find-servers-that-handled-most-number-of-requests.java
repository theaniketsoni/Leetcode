
class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        TreeSet<Integer> free = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            free.add(i);
        }

        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        int[] count = new int[k];

        for (int i = 0; i < arrival.length; i++) {

            while (!busy.isEmpty() &&
                   busy.peek()[0] <= arrival[i]) {

                int[] server = busy.poll();
                free.add(server[1]);
            }

            if (free.isEmpty()) {
                continue;
            }

            int preferred = i % k;

            Integer server = free.ceiling(preferred);

            if (server == null) {
                server = free.first();
            }

            free.remove(server);

            count[server]++;

            busy.offer(new int[]{
                arrival[i] + load[i], server
            });
        }

        int max = 0;

        for (int x : count) {
            max = Math.max(max, x);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                ans.add(i);
            }
        }

        return ans;
    }
}
