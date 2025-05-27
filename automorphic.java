import java.util.Scanner;
public class automorphic {
    public static boolean isAutomorphic(int num){
        int squareOfNumber=num*num;
        while(num>0){
            if(squareOfNumber%10!=num%10){
                return false;
            }
            squareOfNumber/=10;
            num/=10;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Automorphic number:");
        int num=sc.nextInt();
        System.out.println(isAutomorphic(num));
    }
}