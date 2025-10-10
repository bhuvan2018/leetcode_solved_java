import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>res=new ArrayList<>();
        int maxValue=0;
        for(int i=0;i<candies.length;i++){
            maxValue=Math.max(candies[i], maxValue);
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies>=maxValue){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
public class kids_greatest_candies{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println("Kids with greatest candies: " + solution.kidsWithCandies(candies, extraCandies));
    }
}