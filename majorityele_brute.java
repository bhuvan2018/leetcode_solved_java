class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length)/2){
            return nums[i];
            }
        }
        return -1;
    }
}
public class majorityele_brute {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,3};
        int result = sol.majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
}