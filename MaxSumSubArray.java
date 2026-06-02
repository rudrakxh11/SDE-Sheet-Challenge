class Solution {
    public int maxSubArray(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0)
        //     {
        //         count++;
        //         if(count==nums.length){
        //             return -1;
        //         }
        //     }
        // }
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0; i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(cs,ms);
        }
        return ms;
    }
}