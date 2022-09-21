package assignment;

import java.util.Scanner;

public class EvenSumColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of rows: ");
		int n = sc.nextInt();
		System.out.print("Enter no of columns: ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		
		int count = 1;
		for(int i = 0; i < n; i++) {
			String bag = "";
			for(int j = 0; j < m; j++) {
				
				arr[i][j] = count;
				bag += count + " ";
				count++;
			}
			System.out.println(bag);
		}
		
		
		for(int i = 0; i < n; i++) {
			
			int sum = 0;
			for(int j = 0; j < m; j++) {
				
				if(arr[j][i] % 2 == 0) {
					sum += arr[j][i];
				}
			}
			
			System.out.println(sum);
		}
		
	}

}
