package Numbers;

import java.io.*;
import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.next());
		int r ,temp ,s = 0 ;
		
		temp = n;
		
		while (n > 0){
			r = n % 10;
			n = n/10;
			s = s*10+r;
		}
		
		if (temp == s){ 
			System.out.println("you entered a palindrome");
		} else {
			System.out.println("Not a palidrome");
		}
 
	}

}
