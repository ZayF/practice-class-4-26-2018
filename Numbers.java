import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		int four = scan.nextInt();
		int five = scan.nextInt();
		
		
		int [] num = {one,two,three,four,five};
		for(int i = 0; i<=4;i++) {
		
		
		if(num[i] %2==0) {
			System.out.println(num[i]);
		}
		
		
	}
	}
}
