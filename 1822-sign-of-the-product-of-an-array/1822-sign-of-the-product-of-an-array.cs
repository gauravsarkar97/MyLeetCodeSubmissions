public class Solution {
    public int ArraySign(int[] nums) {
        int neg = 0;
        foreach(int n in nums){
            if(n == 0){
                return 0;
            }
            if(n < 0){
                neg++;
            }
        }
        if(neg % 2 == 0)
            return 1;
        else
            return -1;
    }
}