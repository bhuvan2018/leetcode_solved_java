import java.util.Stack;    
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int res[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prev=stack.pop();
                res[prev]=i-prev;
            }
            stack.push(i);
        }
        return res;
    }
}
public class daily_temperature_optimizedStack {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = sol.dailyTemperatures(temperatures);
        System.out.print("The number of days until a warmer temperature for each day is: ");
        for(int i=0;i<temperatures.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}