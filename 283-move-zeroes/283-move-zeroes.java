class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroAt = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZeroAt++] = nums[i];
            }
        }
        
        //fill remaining with 0
        for(int i = lastNonZeroAt; i< nums.length; i++){
            nums[i] = 0;
        }
    }
}