import java.util.Scanner;
public class palindrome {
    public static String isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(temp==rev){
            return "yes";
        } else {
            return "no";
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}