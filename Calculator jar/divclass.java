package objectclass;
import java.util.Scanner;
public class divclass {
	
	public void divlcass()
	{
		Scanner scan = new Scanner(System.in);
		try {
			Thread.sleep(100);
			System.out.println(".");
			Thread.sleep(200);
			System.out.println("..");
			Thread.sleep(300);
			System.out.println("...");
			Thread.sleep(400);
			System.out.println("....");
			Thread.sleep(500);
			System.out.println(".....");
			Thread.sleep(600);
			System.out.println("Addition Set");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Enter Number A");
		double a = scan.nextDouble();
		System.out.println("Enter Number B");
		double b = scan.nextDouble();
		double c = a / b;
		System.out.println("The Difference is " +c);
	}

}
