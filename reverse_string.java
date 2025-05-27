class reverse_string {
    public void reverseString(char[] s) {
        char[] res =new char[s.length];
        for(int i=0;i<s.length;i++) {
            res[s.length-1-i]=s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=res[i];
        }
    }
}