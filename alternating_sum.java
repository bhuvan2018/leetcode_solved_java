class Solution {
    public int alternatingSum(int[] nums) {
        int odd=0, even=0;
        for(int i=0;i<nums.length;i+=2){
            odd+=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            even-=nums[i];
        }
        return odd+even;
    }
}
public class alternating_sum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 2, 5, 3};
        int result = sol.alternatingSum(nums);
        System.out.println("The alternating sum of the array is: " + result);
    }
}