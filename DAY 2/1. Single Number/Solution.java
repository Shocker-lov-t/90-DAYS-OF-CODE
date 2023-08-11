/*  Method 1 : using Brute Force 
    T.C: O(n) & S.C: O(n)        */

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
        return nums[0];
        
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}




/* Method 2: Using XOR {To improve Spcae complexity from O(n)----> O(1) } */

class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}

/* T.C: O(n) & S.C: O(1)

[4,1,2,1,2]
ans=4
    4^1^2^1^2
    4^1^1^0
    4^0^0
    4^0
    4
return 4
*/
