import java.util.HashMap;
public class happy_number {
    public boolean isHappy(int n){
        HashMap<Integer,Boolean> map=new HashMap<>();
        while (n!=1){
            if(map.containsKey(n)){
                return false;
            }
            map.put(n, true);
            int sum=0;
            int current=n;
            while(current>0){
                int digit=current%10;
                sum+=digit*digit;
                current/=10;
            }
            n=sum;
        }
        return true;
    }
}