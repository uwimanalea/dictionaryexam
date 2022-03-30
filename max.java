package takehome;

public class max {
	
	int array[] = new int[]{10, 11, 88, 2, 12, 9};

	public static int getMax(int[] inputArray){ 
	  int maxValue = inputArray[0];

	  for(int i=1;i < inputArray.length;i++){ 
	     if(inputArray[i] > maxValue){ 
	        maxValue = inputArray[i]; 
	     } 
	  } 
	  return maxValue; 
	}
}