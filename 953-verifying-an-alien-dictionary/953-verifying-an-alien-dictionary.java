class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] ranking = new int[26];
        for(int i = 0; i< 26; i++){
            ranking[order.charAt(i) - 'a'] = i;
        }
        
        for(int i = 0; i< words.length-1; i++){
            for(int j = 0; j< words[i].length(); j++){
                if(j >= words[i+1].length())
                    return false;
                
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currWordChar = words[i].charAt(j) - 'a';
                    int nextWordChar = words[i+1].charAt(j) - 'a';
                    if(ranking[currWordChar] > ranking[nextWordChar])
                        return false;
                    else
                        break;
                }
            }
        }
        return true;
    }
}