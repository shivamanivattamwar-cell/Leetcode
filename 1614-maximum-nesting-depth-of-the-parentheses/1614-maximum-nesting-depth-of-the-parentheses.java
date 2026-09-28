class Solution {
    public int maxDepth(String s) {
        int mx=0;
        int c=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('){
                c++;
                mx=Math.max(c,mx);
            }else if(x==')'){
                c--;
            }
        }
        return mx;
    }
}