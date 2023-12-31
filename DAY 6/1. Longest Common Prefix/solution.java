 class Solution {
    public String longestCommonPrefix(String[] s) {
        if (s.length==0) return "";
        String prefix=s[0];
        for (int i=0;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

//TC: O(m*n) & SC: O(1)
