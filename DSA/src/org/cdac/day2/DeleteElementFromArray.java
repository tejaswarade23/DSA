package org.cdac.day2;

import java.util.Scanner;

public class DeleteElementFromArray{
	private static int logicalSize = 0;
	private static int deleteFromPosition(int arr[],int n,int pos) throws Exception{
		//1,2,3,4,5,6,7
		if(pos > logicalSize) {
			throw new Exception("Position is greater than logical size of array...");
		}
		
		for(int i=pos-1;i<logicalSize-1;i++) {
			arr[i] = arr[i+1];
		}
		return --logicalSize;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		arr[logicalSize] = 1;
		++logicalSize;
		arr[logicalSize] = 2;
		++logicalSize;
		arr[logicalSize] = 3;
		++logicalSize;
		arr[logicalSize] = 4;
		++logicalSize;
		arr[logicalSize] = 5;
		++logicalSize;
		
		System.out.println("Before deletion...");
		for(int i=0;i<logicalSize;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("Logical size of array is : "+logicalSize+"\n");
		
		System.out.println("Enter the position of element : ");
		int pos = scanner.nextInt();
		
		try {
			deleteFromPosition(arr,n,pos);
		}
		catch(Exception e) {
			System.out.println(e + "\n");
		}
		
		System.out.println("After deletion...");
		for(int i=0;i<logicalSize;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("Logical size of array is : "+logicalSize+"\n");
	}
}
 