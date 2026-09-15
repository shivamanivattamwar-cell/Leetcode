class RecentCounter {
    Queue<Integer> q;
    int c;
    public RecentCounter() {
        q=new LinkedList<>();
        c=0;
    }
    
    public int ping(int t) {
        int s=t-3000;
        while(!q.isEmpty() && q.peek()<s){
            q.poll();
        }
        q.offer(t);
        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */