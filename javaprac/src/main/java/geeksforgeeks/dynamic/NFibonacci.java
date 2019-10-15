package geeksforgeeks.dynamic;

import java.util.Scanner;

public class NFibonacci {
	static int[] array;
	static boolean print = true;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		while(tests >0){
			int nfib = scanner.nextInt();
			array = new int[nfib+1];
			fib(nfib);
			tests--;
		}
	}

	static int fib(int num){

		if(num == 1) {
			System.out.print(1+" ");
			return 1;
		}
		if(num == 2) {
			if(print){
				System.out.print(1+" ");
				print = false;
			}
			return 1;
		}
		if(array[num] != 0) {
			return array[num];
		}
		else{
			array[num]=fib(num -1) + fib(num -2);

		}
		System.out.print(array[num]+" ");
		return array[num];
	}
}
