
import java.util.Scanner;

public class LargestOf3Numbers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 3 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int lar = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
		
		System.out.printf("largest of (%d, %d, %d) = %d", n1, n2, n3, lar);
		
		sc.close();
	}
}

