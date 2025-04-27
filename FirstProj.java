package Practice_java;
import java.util.Arrays;
import java.util.Collections;

public class FirstProj {

	public static void sumMethod(int a, int b) {
		System.out.println("Value of a - "+a);
		System.out.println("Value of b - "+b);
		int c = 0;
		try {
			c = a/b;
		}catch(Exception e) {
			System.out.println("Value of b cannot be zero");
		}
		
		if(b==0)
			throw new ArithmeticException("Value of b cannot be zero");
		
		
		System.out.println("Sum of a and b - "+c);
		System.out.println("Hello World");
	}
	


	public static void main(String[] args) {
		//
		int a,b;
		a =90; 
		b=10;
		sumMethod(a,b);
	}
}
