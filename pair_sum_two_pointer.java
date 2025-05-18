public class pair_sum_two_pointer {
    public static boolean hasPair(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right]);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,5,7,999};
        int target=6;
        boolean result=hasPair(arr,target);
        System.out.println(result);
    }
}