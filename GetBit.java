public class GetBit {
   public static void main(String[] args) {
    System.out.println(getBit(5, 01));
   }
   static int getBit(int n ,int pos){
    return( (n>>pos) & 1);
   }
   
}
