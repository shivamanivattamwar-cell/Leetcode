class Solution {
    public String removeOuterParentheses(String s) {
        String k="";
        String temp="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                temp+=c;
                count++;
            }else{
                temp+=c;
                count--;
            }
            
            if(count==0){
                for(int j=1;j<temp.length()-1;j++){
                    char ch=temp.charAt(j);
                    k+=ch;
                }
                temp="";

            }

        }
        return k;
    }
}