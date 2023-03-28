package TrainingCodes;

import java.util.Scanner;

public class Heart {

	public static void main(String[] args) 
			throws InterruptedException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	int n= sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((j==(n/2))&& (i==(n/2)-3) || (j==(n/2)-1)&& (i==(n/2)-4) || (j==(n/2)-3)&& (i==0)
				 || (j==(n/2)-4)&& (i==0) || (j==(n/2)-2)&& (i==0) ||
				(j==(0))&& (i==(n/2)-4) || (j==0)&& (i==(n/2)-2) || (j==(n/2)-4)&& (i==(n/2)-1) ||
				(j==(n/2)-3)&& (i==(n/2)) || (j==(n/2)-2)&& (i==(n/2)+1) ||
				(j==(n/2)-1)&& (i==(n/2)+2) || (j==(n/2))&& (i==(n/2)+2) || 
				(j==(n/2)+1)&& (i==(n/2)+1) || (j==(n/2)+2)&& (i==(n/2)) || 
				(j==(n/2)+3)&& (i==(n/2)-1) || (j==(n/2)+4)&& (i==(n/2)-2)||
				(j==(n/2)+4)&& (i==(n/2)-3) || (j==(n/2)+4)&& (i==(n/2)-4) ||
				(j==(n/2)+3)&& (i==0) || (j==(n/2)+2)&& (i==0) || (j==(n/2)+1)&& (i==(n/2)-4)
				
				) {
				Thread.sleep(700);
				System.out.print(" * ");
		}
			else {
				System.out.print("   ");
			}
	   }
              System.out.println();
	}

  }
}