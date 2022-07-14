package com.pack1;
import java.util.Scanner;

public class ConditionCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float a,b,c;
		try {
		System.out.println("Enter a two values for checking:");
		a=scan.nextFloat();
		b=scan.nextFloat();
		
		if(a>b) {
			System.out.println("a is greater");
		}
		else if(b>a){
			System.out.println("a is smaller");
		}
		else {
			System.out.println("value ia may be same");
		}
		}
		catch(Exception e){
			System.out.println("Some error occured");
		}
	    System.out.println("Next argument is ready");
	    
	    
	    
	}

}
