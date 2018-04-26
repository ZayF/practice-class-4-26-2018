import java.util.Scanner;
public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 8 numbers");
		
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		int four = scan.nextInt();
		int five = scan.nextInt();
		int six = scan.nextInt();
		int seven = scan.nextInt();
		int eight = scan.nextInt();
	
		int sum = 0;
		int [] integer = {one,two,three,four,five,six,seven,eight};
		for(int i = 0; i <= 7; i++) {
		
		sum = integer[i] + sum;
		}
		
		int average = sum/8;
		System.out.println(average);
		
		
	}
}
