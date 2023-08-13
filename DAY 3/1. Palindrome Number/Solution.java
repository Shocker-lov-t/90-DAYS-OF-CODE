class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        while(x>r){
            r=r*10+x%10;
            x/=10;
        }
        if(x==r || x==r/10){
            return true;
        }
        else{
            return false;
        }
        
    }
}
