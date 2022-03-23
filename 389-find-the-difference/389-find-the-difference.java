class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0)
            return t.charAt(0);
        
//         char ch = 0;
//         for(int i = 0; i < s.length(); i++){
//             ch ^= s.charAt(i);
//         }        
//         for(int i = 0; i < t.length(); i++){
//             ch ^= t.charAt(i);
//         }
        
        /* Using single Loop*/
        char ch = t.charAt(t.length()-1);  //last character of t
        for(int i = 0; i < s.length(); i++){
            ch ^= s.charAt(i);
            ch ^= t.charAt(i);
        }
        
        return ch;
    }
}