class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        int c = 0;
        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[] { i, tickets[i] });
        }
        while (!q.isEmpty()) {
            int[] person = q.poll();
            person[1]--;
            c++;
            if (person[0] == k && person[1] == 0) {
                break;
            }
            if(person[1]>0){
                q.offer(person);
            }
        }

        return c;

    }
}