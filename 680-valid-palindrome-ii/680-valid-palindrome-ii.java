class Solution {
    public boolean validPalindrome(String s) {
        int allowedDeletion = 1;
        
        for(int i = 0, j = s.length()-1; i < j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return (checkPalindrome(s, i, j-1) || checkPalindrome(s, i+1, j));
            }
        }
        return true;
    }
    
    private boolean checkPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}