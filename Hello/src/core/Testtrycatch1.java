package core;
import java.util.Scanner;
public class Testtrycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a, b;
			System.out.println("enter the value of a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			int data = a / b; // may throw exception
			System.out.println("data value is " + data);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("rest of the code...");
	}

	}


