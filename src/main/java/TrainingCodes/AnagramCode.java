package TrainingCodes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCode {

	public static void main(String[] args) {
		//Step-1
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String s1 = sc.next();
		System.out.println("String 2:");
		String s2 = sc.next();
		
		//Step-2
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		//Step-3
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//Step-4
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}

}
