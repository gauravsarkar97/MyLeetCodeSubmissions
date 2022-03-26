public class Solution {
    public int CountOdds(int low, int high) {
        int range = high - low + 1;
        int count = 0;
        if(range % 2 == 0){
            count = range/2;
        }
        else{
            if(low % 2 != 0){   //low is odd number
                count = range/2 + 1;
            }
            else{
                count = range/2;
            }
        }
        return count;
    }
}