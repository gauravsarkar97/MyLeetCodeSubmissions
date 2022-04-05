class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!myMap.containsKey(nums[i])){
                myMap.put(nums[i], 1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}