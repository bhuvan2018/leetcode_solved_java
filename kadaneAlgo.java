public class kadaneAlgo {
    public static int maximumSubArraySum(int nums[]){
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[]={2, 1, 5, 1, 3, 2};
        System.out.println("Maximum Subarray Sum is: " + maximumSubArraySum(nums));
    }
}