
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = -128;
		System.out.println(b);
		
		b = 12;
		System.out.println(b);
		
		b = 127;
		System.out.println(b);
		
		//b = 128; //Type mismatch: cannot convert from int to byte
		
		long pop = 2147483647;
		System.out.println("world population =  " + pop);
		
		//pop = 2147483648; //The literal 2147483648 of type int is out of range
		pop = 2147483648L;
		System.out.println("world population =  " + pop);
		
		//int n = 12L; //Type mismatch: cannot convert from long to int
		int n = (int) 12L; //typecasting
		System.out.println(n);		
		
		
		b = (byte)128;
		System.out.println(b);
		
		//b = (byte)325;
		System.out.println(b);
	}
}
