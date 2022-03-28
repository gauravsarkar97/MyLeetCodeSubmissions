class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length == 3){
            if(checkTriangle(nums[0], nums[1], nums[2])){
                return (nums[0]+ nums[1]+ nums[2]);
            }
            else
                return 0;
        }
        
        Arrays.sort(nums);   //sorts array in ascending order
        for(int i = nums.length-1; i >= 2; i--){
            if(checkTriangle(nums[i], nums[i-1], nums[i-2])){
                return (nums[i]+ nums[i-1]+ nums[i-2]);
            }
        }
        return 0;
    }
    
    private Boolean checkTriangle(int a, int b, int c){
        if(a+b > c && b+c>a && a+c>b)
            return true;
        else
            return false;
    }
    
}