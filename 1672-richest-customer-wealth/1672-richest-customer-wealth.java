class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int wealth_of_person = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth_of_person += accounts[i][j];
            }
            if(wealth_of_person > max_wealth)
                max_wealth = wealth_of_person;
        }
        return max_wealth;
    }
}