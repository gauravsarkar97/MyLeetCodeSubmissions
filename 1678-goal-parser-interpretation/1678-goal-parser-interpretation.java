class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i< command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans.append('G');
            }
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans.append('o');
                i++;
            }
            if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                ans.append("al");
                i += 3;
            }
        }
        return ans.toString();
    }
}