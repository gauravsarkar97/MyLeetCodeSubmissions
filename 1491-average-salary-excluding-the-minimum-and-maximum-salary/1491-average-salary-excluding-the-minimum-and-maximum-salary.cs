public class Solution {
    public double Average(int[] salary) {
        Array.Sort(salary, 0, salary.Length);
        if(salary.Length == 3){
            return salary[1];
        }
        double sum = 0.0;
        for(int i = 1; i <= salary.Length - 2; i++){
            sum += salary[i];
        }
        return sum/(salary.Length - 2);
    }
}