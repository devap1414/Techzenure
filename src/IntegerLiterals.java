/**
 * program to understand Integer Literals
 * @author Sunil Joseph
 * @since 27th July 2023
*/
public class IntegerLiterals {

	public static void main(String[] args) {
		System.out.println(12);
		System.out.println(012);
		System.out.println(0x12);
		System.out.println(0X12);
		System.out.println(0b11);
		System.out.println(0B11);
		
		System.out.println("Octal Decimal Value of 65 = " + Integer.toOctalString(65));
		System.out.println(0101); //65
		System.out.println("Hexa Decimal Value of 65 = " + Integer.toHexString(65));
		System.out.println("Binary Value of 65  = " + Integer.toBinaryString(65));
	}
}
