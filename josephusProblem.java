public class josephusProblem{
    public static int driverFunction(int n , int k){
        int ans = josephusUtil(n,k);
        return ans+1;
    }
    public static int josephusUtil(int n , int k){
        if(n==1) return 0;
        int ans = josephusUtil(n-1,k);
        ans = (ans+k)%n;
        return ans;
    }
}