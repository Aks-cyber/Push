public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	int i,k,n;
      
        n = 0;
        k = 0;
      
        for(i = 0; i < arr.length; i++){
               
               if(arr[i] != 0){
                n = arr[i];
                arr[i] = arr[k];
                arr[k] = n;
                k++;
            }
            
        }
    }

}
