public class OddEven {
    public static void main(String[] args) {
        int number=1023;
        // oddEven(number);
        System.out.println(oddEven(number));
    }
    // static void oddEven(int n){
    //     if((n & 1)==1){
    //         System.out.println("odd");

    //     }
    //     else{
    //         System.out.println("even");
    //     }
    // }
    static boolean oddEven(int n ){
         return (n & 1)==1;
    }
}
