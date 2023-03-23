package TrainingCodes;

import java.util.Scanner;

public class moviehouse {

	public static void main(String[] args) {
	System.out.println("Enter the no of movie house");
	Scanner sc=new Scanner(System.in);
	int movhse=sc.nextInt();
	System.out.println("Enter the no of theatres in each movie house");
	int thea=sc.nextInt();
	System.out.println("Enter the no of screens in each theartre");
	int scr=sc.nextInt();
	
	int arr[][][]=new int[movhse][thea][scr];
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside movie house no"+(i+1) );
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside theatre no"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the capacity of screen no"+(k+1));
				arr[i][j][k]=sc.nextInt();
				
			}
		}
				
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside movie house no"+(i+1) );
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside theatre no"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the funds of screen no"+(k+1));
				int fund=arr[i][j][k]*350;
				System.out.println(fund);
			}
		}
				
	}
}
}