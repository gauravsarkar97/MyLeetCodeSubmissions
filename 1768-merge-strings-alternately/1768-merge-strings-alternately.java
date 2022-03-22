class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i< len1+len2; i++){
            if(i < len1 && i < len2){
                ans.append(word1.charAt(i)).append(word2.charAt(i));
                // System.out.println("WORD 1 "+word1.charAt(i));
                // System.out.println("WORD 2 "+word2.charAt(i));
                // System.out.println("ANS " + ans);
            }
            if(i >= len1 && i < len2){
                ans.append(word2.charAt(i));
            }
            if(i >= len2 && i < len1){
                ans.append(word1.charAt(i));
            }
        }
        return ans.toString();
    }
}