package LeeCode;
    class Solution {
        public int[]twoSum(int[] nums, int target) {
            int[] result=new int[2];
            int i,j;
            int k=nums.length;
            for(i=0;i<k-1;i++){
                for(j=i+1;j<k;j++){
                    if(nums[i]+nums[j]==target){
                        result[0]=i;result[1]=j;
                        break;}
            }
            }
        return result;
    }
    }
