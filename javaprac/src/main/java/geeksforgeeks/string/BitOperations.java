package geeksforgeeks.string;

import org.omg.PortableInterceptor.Interceptor;

public class BitOperations {
	public static void main(String[] args) {
		int val1 = 5;
		int  val2 = 7;
		System.out.println(val1 & val2);

		System.out.println("Getting binary ...");
		bin(9);
		System.out.println();
		bin(4);
		System.out.println(Integer.toBinaryString(9));

		System.out.println("0x000F;"+0x000F); //15
		System.out.println("0x2222;"+0x2222); //8738
		System.out.println("15 in binary ="+Integer.toBinaryString(0x000F)); //1111
		System.out.println("8738 in binary ="+Integer.toBinaryString(0x2222)); //10001000100010
		System.out.println(0x2222 & 0x000F);
	}

	static void bin(int n)
	{
		/* step 1 */
		if (n > 1)
			bin(n/2);

		/* step 2 */
		System.out.print(n % 2);
	}
}
