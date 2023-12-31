class Solution {
    public void reverseString(char[] s) {
        int r_index=s.length-1;
        int l_index=0;
        while(l_index<r_index){
            char temp=s[l_index];
            s[l_index]=s[r_index];
            s[r_index]=temp;
            l_index++;
            r_index--;
        }
    }
}
//TC: O(n) && SC: O(1)
