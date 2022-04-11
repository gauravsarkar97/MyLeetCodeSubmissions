class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        
        int r = grid.length;
        int c = grid[0].length;
        
        int[] arr = new int[r*c];
        int[] rotated = new int[r*c];
        int curr = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[curr++] = grid[i][j];
                //System.out.println(arr[curr-1]);
            }
        }
        
        
        int len = r*c;
        int row_count = 0;
        curr = 0;
        k = k % len;   //after length of array = r*c rotations, we get back same array
        for(int i = 0; i < len; i++){
            if(row_count == c){
                ans.add(new ArrayList<Integer>(row));
                // System.out.println("ROW " + row);
                // System.out.println("ANS " + ans);
                row.clear();
                row_count = 0;
                
                //System.out.println("----BREAK----");
            }
            
            if(i < k){
                row.add(arr[len+i-k]);
                //System.out.println("ELEMENT: " + arr[len+i-k]);
            }
            else{
                row.add(arr[i-k]);
                //System.out.println("ELEMENT: " + arr[i-k]);
            }
            row_count++;
        }
        ans.add(new ArrayList<Integer>(row));
        // System.out.println("ROW " + row);
        // System.out.println("ANS " + ans);
        return ans;
    }
}