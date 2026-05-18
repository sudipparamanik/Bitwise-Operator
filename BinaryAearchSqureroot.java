// this is for perfect squre root number
public class BinaryAearchSqureroot {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(squreRoot(n));
        

    }
    static int squreRoot(int n){
        int s=0;
        int e=n;
        int ans =0;
        while(s<=e){
            int mid=s+(e-s)/2 ;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid < n){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }

        }
        return ans;
        
    }
}
 