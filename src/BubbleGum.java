import java.util.*;

public class BubbleGum {
	
	public static void main(String[] param) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey buddy! How many elements to sort ??? ");
		
		int n = s.nextInt();
		
		System.out.print("Enter your numbers one by one :) - ");
		
		int mylist[] = new int[n];
		
		for(int i = 0; i< n; i++)
			mylist[i] = s.nextInt();
		
		bubbleSort(mylist);
		
		
		System.out.print("Your sorted list -> ");
		for(int i = 0; i< n; i++) {
			System.out.print(mylist[i]+" ");
		}
	}
	
	private static void bubbleSort(int[] alist) {
		
		int list_length = alist.length;
		for(int i = 0; i< list_length; i++)
			for(int j = 0; j< list_length-i-1; j++)
				if(alist[j]>alist[j+1]) {
					int t = alist[j];
					alist[j]= alist[j+1];
					alist[j+1] = t;
				}
	}

}
