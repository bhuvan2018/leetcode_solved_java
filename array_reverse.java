class array_reverse {
    public static void revArray(int n[]){
        for(int i=0;i<n.length-1;i++){
            int temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        revArray(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
    }
}