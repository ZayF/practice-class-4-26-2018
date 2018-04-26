import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	System.out.println("What is your age?");	
	System.out.println("How much do you weigh?");
	System.out.println("What is your income?");	
	
	int a = scan.nextInt();
	int b = scan.nextInt();	
	int c = scan.nextInt();	
	
	if (a < 18) {
		System.out.println("Minor Category");
	}
	if (a >=18 && a<=38 && b<200)	{
		System.out.println("Healthy Category");
	}
	if (a >= 38 && a <= 58 && c == 50000)	{
		System.out.println("Low Risk Category");
	}
	if (a > 58) {
	System.out.println("High Risk Category");
	
	}
	}
}
