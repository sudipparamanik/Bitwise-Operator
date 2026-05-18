public class CountSetBits {

   public static void main(String[] args) {
    int n =10;
    System.out.println(setbits(n));
    System.out.println(Integer.toBinaryString(n));
   }
   static int setbits(int n){
    int count =0;
    while(n>0){
        count ++;
        n=n & (n-1);
    }
    return count;
   }

}
