// Brute Force
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length-1;i++){
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[i]+nums[j]==target){
//                 return new int[]{i+1,j+1};
//             }
//         }
//         }
//         return null;
//     }
// }

// Optimised 

class Solution {
    public int[] twoSum(int[] nums,int target){
      int left=0;
      int sum=0;
      int right=nums.length-1;
      while(left<right){
        sum=nums[left]+nums[right];
        if(sum==target){
            return new int[] {left+1,right+1};
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
      }
      return null;
}
}