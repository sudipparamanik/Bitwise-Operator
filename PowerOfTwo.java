public class PowerOfTwo {
    public static void main(String[] args) {
        int numb=9;
        if((numb & (numb-1))==0){
            System.out.println("this is power of two");

        }else{
            System.out.println("not power of two");
        }
    }
}
