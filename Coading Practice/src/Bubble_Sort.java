import java.util.Scanner;

public class Bubble_Sort {
	void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					 int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
				}
			}
		}
	}
		/*boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	}*/
	void printArray(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;++i){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		Bubble_Sort bs = new Bubble_Sort();
		bs.bubbleSort(arr);
		System.out.println("Sorted Array is...");
		bs.printArray(arr);;
		
	}

}
