package RepeatingElementsPackage;

public class RepeatingMethods {
	 public static int maxRepeat(int arr[], int n, int k){
	        int count[] = new int[k+1];

	        for(int i = 0; i <= k; i++){
	            count[i] = 0;
	        }
	       
	        for(int i = 0; i < n; i++){
	            count[arr[i]] += 1;
	        }
	    
	        int max_count = count[0];
	        int index = 0;
	     
	        for(int i = 1; i <= k; i++){
	            if(count[i] > max_count){
	                max_count = count[i];
	                index = i;
	            }
	        }

	        return index;
	 }
	 
	 public static int maxRepeatRecur(int[] array, int n, int max){   
		    if(n == array.length)
		        return max;

		    if (array[n] > max){
		        max = array[n];
		    }
		    return maxRepeatRecur(array, n + 1,max);
		}
	 
	 
}
