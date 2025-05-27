import java.util.Scanner;
public class armstrong {
    public static int count(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num, int exp){
        int original=num,sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=Math.pow(rem,exp);
            num/=10;
        }
        return sum==original;
    }
    public static int pow(int base, int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num=sc.nextInt();
        int countDigit=count(num);
        if(isArmstrong(num,countDigit)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}