package array;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int a[] = new int[20];
		
		for(int i=0;i<size;i++) {			
				a[i] = sc.nextInt();			
		}
		
		int pos = sc.nextInt();
		
		int ele = sc.nextInt();
		
		int temp = a[pos-1]; //3
		a[pos-1] = ele;
		
		int temp2;
		for(int i=pos;i<=size;i++) {			
			temp2 = temp;
			temp = a[i];
			a[i] = temp2;
			
	}

	}

}

//1,2,10,3,5
//3,10
//1,2,10,3,4,5



