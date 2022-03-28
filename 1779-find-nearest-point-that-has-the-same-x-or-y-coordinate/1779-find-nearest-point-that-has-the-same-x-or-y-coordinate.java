class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int dist = Integer.MAX_VALUE;
        for(int i = 0; i< points.length; i++){
            int d;
            if(x == points[i][0]){
                d = Math.abs(y - points[i][1]);
            }
            else if(y == points[i][1]){
                d = Math.abs(x - points[i][0]);
            }
            else
                continue;
            
            if(d < dist){
                dist = d;
                index = i;
            }
        }
        return index;
    }
}