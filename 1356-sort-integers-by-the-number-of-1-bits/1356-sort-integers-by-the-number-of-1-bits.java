class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            ans.add(arr[i]);
            map.put(arr[i], NoOfOnes(arr[i]));
        }
        
        Collections.sort(ans, (a,b) -> (map.get(a) == map.get(b))? a-b : map.get(a)-map.get(b));
        
        int k =0;
        for(int num: ans){
            arr[k++] = num;
        }
        return arr;
    }
    
    private int NoOfOnes(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}