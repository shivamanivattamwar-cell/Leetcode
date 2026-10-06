class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        arr[0]=0;
        arr[1]=1;
        fi(n,arr);
        return arr[n];
    }
    public int fi(int n,int[] arr){
        if(n<=1){
            return arr[n];
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n]=fi(n-1,arr)+fi(n-2,arr);
    }
}