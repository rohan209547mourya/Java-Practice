package quickSort;

import java.util.Arrays;

public class RandomizedQuickSort {
	
	public static void main(String[] args) {
		
		
		int[] arr = {93,2,45,2938,382,302,384,2,4,5,2};
		
		
		RandomizedQuickSort a1 = new RandomizedQuickSort();
		
		
		
		System.out.println(Arrays.toString(a1.sortArray(arr)));
		
	}
	
    public int[] sortArray(int[] nums) {
    	
        quickSort(nums, 0 , nums.length - 1);
        
        return nums;
    }
    
    public int partition(int[] arr, int start, int end) {
    	
        int pIndex = (int) (Math.random() * (end - start + 1)) + start;
        
        int pivot = arr[pIndex];
        while (start < end) {
        	
            while (start < end && arr[start] <= pivot) {
            	
                start++;
            }

            while (start < end && arr[end] >= pivot) {
                end--;
            }
            
            if (start < end) {
                swap(arr, start, end);
            }
        }
        if (arr[start] < pivot) {
            swap(arr, pIndex, start);
        }
        return start;
    }
    
    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            if (pIndex > start) {
                quickSort(arr, start, pIndex - 1);
            }
            if (pIndex < end) {
                quickSort(arr, pIndex, end);
            }
        }
    }

    private void swap(int[] arr, int x, int y) {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}