class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                while(!s1.isEmpty()){
                    char ch=s1.pop();
                    if(ch=='('){
                        break;
                    }
                    s2.push(ch);
                }

                for(char x: s2){
                    s1.push(x);
                }
                s2.clear();
            }else{
                s1.push(c);
            }

        }
        String k="";
        for(char a:s1){
            k+=a;
            
        }

        return k;
    }
}