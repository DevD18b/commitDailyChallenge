import java.util.ArrayList;

public class exactlyDivisibleNine{

    public static int exactlyDivisible(int n){
          ArrayList<Integer> prime = new ArrayList<>();
          int m = (int)Math.sqrt(n);
          int [] isPrime = new int[(int) Math.sqrt(n)+1];
          for(int i =2; i*i<=m; i++)
          {
            if(isPrime[i]==1){
            for(int j =i*i; j<=m; j+=i){
                     isPrime[j] = 0;
            }
        }
    }
      
    for(int i =0; i<=m;  i++){
        if(isPrime[i]==1){
        prime.add(i);
        }
    }
     int res = 1;
    int count  =0;
    int size = prime.size();
    for(int i = size-1; i>=0; i--){
        int p1 = prime.get(i);
        int cannotExceedValue = (int)(Math.sqrt(n)/p1);
        int low  =0;
        int high = i-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            int p2 = prime.get(mid);
            if(p2<=cannotExceedValue){
                low = mid+1;
            }
            else{
                res = mid;
                high = mid-1;
            }
        }
        count*=res;
    }
    for(int i =0; i<size; i++){
        int s = prime.get(i)*prime.get(i);
        if(s*s*s*s<=n){
            count+=1;
        }
        else{
            break;
        }
    }
    return count;






    }
}