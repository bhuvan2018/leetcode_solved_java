class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}
public class sorted_rotated_array{
    public static void main(String args[]){
        Solution sol=new Solution();
        int[] nums={3,4,5,1,2};
        System.out.print(sol.check(nums));
    }
}