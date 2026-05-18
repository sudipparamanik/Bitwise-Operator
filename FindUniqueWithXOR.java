// find the unique number in the array
public class FindUniqueWithXOR {
     public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,4};
        // in mathematics {2x3x5x6}=={3x5x2x6} this is also same,beacause hare oder is not follow,,as that as XOR problem
        //initially i takes 0 ,and think in my mind that {2,3,4,1,2,1,3,6,4} == {2,2,1,1,4,4,3,3,6} is also same
        //so i cam apply XOR method ,, in XOR same numbers gives 0 ,
        System.out.println(answer(arr));
    }
    static int answer(int arr[]){
        int unique=0; //initially
        for(int n : arr){
            unique ^=n;
        }
        return unique;
    }
}


