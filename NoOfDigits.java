public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567; // if i say a=10 ,and b=2 , it give me 4 beacause 10 in binarry == 1010
        int b=10;
        int ans=(int)(Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}


