class Solution{
    public char repeatedCharacter(String s){
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<i;j++){
                if(chars[i]==chars[j]){
                    return chars[i];
                }
            }
        }
        return 0;
    }
}
public class first_letter_appear_twice{
    public static void main(String[] args){
        Solution sol=new Solution();
        String input="letter";
        char result=sol.repeatedCharacter(input);
        System.out.println("First repeated character: " +result);
    }
}