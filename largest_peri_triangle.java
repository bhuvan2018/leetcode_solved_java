import java.util.Arrays;
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return 0;
    }
}
public class largest_peri_triangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 1, 2};
        int result = sol.largestPerimeter(nums);
        System.out.println("The largest perimeter of a triangle that can be formed is: " + result);
    }
}