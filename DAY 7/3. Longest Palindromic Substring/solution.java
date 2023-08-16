public class Solution {
    int start=0,end=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            Center(s,i,i);
            Center(s,i,i+1);
        }
        return s.substring(start,end+1);
    }
    private void Center(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        l+=1;
        r-=1;
        if(end-start+1 < r-l+1){
            start=l;
            end=r;
        }
    }
}

//TC: O(n^2) , SC: O(1)
