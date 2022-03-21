class Solution {
    public void moveZeroes(int[] nums) {
        //using extra array
        List<Integer> myList = new ArrayList<Integer>();
        int zero_count = 0;
        
        //counting no. of zeros and adding non-zero elements to list
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0)
                zero_count++;
            if(nums[i] != 0)
                myList.add(nums[i]);
        }
        
        //adding all zeroes to end of list
        while(zero_count != 0){
            myList.add(0);
            zero_count--;
        }
        
        //iterating through list and assigning back to original array
        int i = 0;
        for(Integer n: myList){
            nums[i++] = n;
        }
    }
}