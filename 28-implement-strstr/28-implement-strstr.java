class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        
        if(needle.isEmpty())
            return 0;
        if(needle.length() > haystack.length())
            return -1;
        
        boolean flag = false;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && haystack.length()-i >= needle.length()){
                flag = true;
                for(int j = 1; j < needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    return i;
            }
        }
        return -1;
    }
}