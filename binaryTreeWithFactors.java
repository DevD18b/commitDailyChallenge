import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class binaryTreeWithFactors{
    public static int binaryTreeFactors(int [] arr){
              // we are given an array where in which 
              // we need to return the
              //  total number of the ways in which we can form the binary tree.
         
              // this is august leetcode challenge problem

              Arrays.sort(arr);
              int n = arr.length;

              HashMap<Integer,Long> map =  new HashMap<>();

              for(int i =0;i<n; i++){
               long count = 1l;
               for(int j =0; j<i; j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    count+=map.get(arr[j])*map.get(arr[i]/arr[j]);
                }
               }
               map.put(arr[i], count);
              }
         long totalCount  = 0l;
    for(Map.Entry<Integer,Long> m : map.entrySet()){
      totalCount += m.getValue();
    }
      return (int)(totalCount%(Math.pow(10, 9)+7));
    }
}