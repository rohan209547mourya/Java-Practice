package assignment;

public class PrimeNumber {
	
	public int[] findPrimeNumber(int[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
      		boolean flag = false;
      		
			for(int j = 2; j < arr[i]; j++) {
				
				if(arr[i] % j == 0) {
					
					flag = true;
				}
			}
			
			if(!flag) {
				
				count++;
			}
			
		}
		int [] result = new int[count];
		int k = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
      		boolean flag = false;
      		
			for(int j = 2; j < arr[i]; j++) {
				
				if(arr[i] % j == 0) {
					
					flag = true;
				}
			}
			
			if(!flag) {
				
				result[k] = arr[i];
				
				k++;
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p1 = new PrimeNumber();
		
		int[] arr = {10 , 12  ,5 , 50 , 11 , 14 , 15};
		
		int[] temp = p1.findPrimeNumber(arr);
		
		for(int i : temp) {
			
			System.out.println(i);
		}

	}

}
