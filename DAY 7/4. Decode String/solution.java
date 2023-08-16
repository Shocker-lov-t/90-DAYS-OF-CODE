class Solution {
    public String decodeString(String s) {
        Stack<Integer> ns=new Stack<>();
        Stack<String> ss=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for (int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch-'0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                    num=num*10+s.charAt(i+1)-'0';
                    i++;
                }
                ns.push(num);
            } else if(ch=='['){
                ss.push(sb.toString());
                sb=new StringBuilder();
            } else if (ch==']'){
                int k=ns.pop();
                StringBuilder tmp= new StringBuilder(ss.pop());
                for(int j=0;j<k;j++){
                    tmp.append(sb);
                }
                sb=tmp;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
//TC: O(n*k) , SC:(n) 
