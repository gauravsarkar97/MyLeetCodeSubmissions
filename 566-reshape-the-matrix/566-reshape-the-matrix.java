class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mRows = mat.length;
        int mCols = mat[0].length;
        
        //check if reshape operation is possible
        if(mRows*mCols != r*c){
            return mat;
        }
        
        //check if original and new mtrx are same
        if(mRows == r && mCols == c)
            return mat;  
        
        int[][] ans = new int[r][c];  //new ans mtrx
        
        int row = 0;
        int index = 0;
        for(int i = 0; i < mRows; i++){
            for(int j = 0; j < mCols; j++){
                System.out.println(mat[i][j]);
                ans[row][index++] = mat[i][j];
                if(index == c){
                    index = 0;
                    row++;
                }
            }
        }
        return ans;
    }
}