import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] param) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey buddy! How many elements to sort ??? ");
		
		int n = s.nextInt();
		
		System.out.print("Enter your numbers one by one :) - ");
		
		int mylist[] = new int[n];
		
		for(int i = 0; i< n; i++)
			mylist[i] = s.nextInt();
		
		insertionSort(mylist);
		
		System.out.print("Your sorted list -> ");
		for(int i = 0; i< n; i++) {
			System.out.print(mylist[i]+" ");
		}
	}
	
	private static void insertionSort(int[] alist) {
		
		int list_length = alist.length;
		for(int i = 0; i< list_length; i++) {
			int ce = i;
			while(ce>=1 && alist[ce]<alist[ce-1]) {
				int t = alist[ce];
				alist[ce]= alist[ce-1];
				alist[ce-1] = t;
				ce--;
			}
		}
	}
}
