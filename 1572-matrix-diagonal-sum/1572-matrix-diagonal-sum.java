class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length == 1)
            return mat[0][0];
        
        int sum = 0;
        int len = mat[0].length;
        for(int i = 0; i < len; i++){
            sum += mat[i][i] + mat[i][len-i-1];
        }
        
        //if odd marix subtract middle element once
        if(len % 2 != 0) {
            sum = sum - mat[len/2][len/2];
        }
        return sum;
    }
}