class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        if(n == 0)  return ans;
        
        for(int i = 1; i <= n; i++){
            ans[i] = noOfBits(i);
        }
        return ans;
    }
    
    private int noOfBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}