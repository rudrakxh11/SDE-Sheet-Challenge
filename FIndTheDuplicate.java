class Solution {
    public int findDuplicate(int[] nums) {
        int []a= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){

            if(a[nums[i]]==0){
                a[nums[i]]=nums[i];
            }
            else{
                count=a[nums[i]];
                break;
            }
        }
        return count;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==nums[i]){
        //             count=nums[j];
        //             break;
        //         }
        //     }
        // }
        // return count;
    }
}