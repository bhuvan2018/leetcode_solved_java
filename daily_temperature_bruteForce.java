class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    res[i]=j-i;
                    break;
                }
                res[i]=0;
            }
        }
        return res;
    }
}
public class daily_temperature_bruteForce {
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