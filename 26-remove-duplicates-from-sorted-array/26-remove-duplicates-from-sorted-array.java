class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                continue;
            
            if(nums[i] > nums[i-1]){
                nums[slow+1] = nums[i];
                slow += 1;
            }
        }
        
        return slow+1; //since we took k as 0-indexed, adding 1 to get real position
    }
}