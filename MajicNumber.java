public class MajicNumber {
    public static void main(String[] args) {
        int n = 3;
        int ans =0;
        int base=5;
        while(n>0){
            int last=n & 1; // to get last bit 0 or 1 
            n= n >> 1;
            ans += last * base;
            base=base*5 ; // base = 5 ( 5,25,125....)
        }
        System.out.println(ans);

    }
}

