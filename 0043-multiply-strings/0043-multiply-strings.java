class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int[] arr=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int p1=i+j;
                int p2=i+j+1;
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int p=a*b;
                int sum=p+arr[p2];
                arr[p2]=sum%10;
                arr[p1]+=sum/10;
            }
        }

        String k="";
        for(int i=0;i<arr.length;i++){
            if(k.isEmpty() && arr[i]==0){
                continue;
            }
            k+=arr[i];
        }
        return k;
    }
}