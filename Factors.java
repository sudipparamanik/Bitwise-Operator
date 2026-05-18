import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        // factors(30);
        // factors1(40);
        factors2(40);
    }
    // that needs o(n) time complexity
    static void factors(int n){
        for(int i =1 ; i<=n; i++){
            if(n % i==0){
                System.out.print( i + " ");
            }
        }
    }
    //o(sqrt(n))
    static void factors1(int n ){
        for(int i= 1 ; i<=Math.sqrt(n);i++){
            if(n % i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " "+ n/i + " ");
                }
            }

        }
    }
    // both time and space with be O(sqrt(n))
    static void factors2(int n ){
        ArrayList<Integer>list= new ArrayList<>();
        for(int i= 1 ; i<=Math.sqrt(n);i++){
            if(n % i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }

        }
        for (int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}


 