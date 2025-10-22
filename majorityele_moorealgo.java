class Solution{
    public int majorityElement(int[] nums) {
        int freq=0, ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0) ans=nums[i];
            if(ans==nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
}
public class majorityele_moorealgo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,3};
        int result = sol.majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
}