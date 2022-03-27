public class Solution {
    public bool IsPowerOfTwo(int n) {
        if(n == 1)
            return true;
        
        return (n > 0) && (n % 2 == 0 && IsPowerOfTwo(n/2));
    }
}