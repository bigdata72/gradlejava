package geeksforgeeks.string;

import java.util.Arrays;

public class GreatestDivisor {

	static int gcd(int a, int b){
		if(a==0){
			return b;
		}
		return gcd(b%a, a);
	}

	static int gcd(int [] arr){
		int x = arr[0];
		if(arr.length==1){
			return x;
		}else{
			int[] rem = new int[arr.length -1];

			for(int i=1; i<arr.length; i++ ){
				rem[i-1]=arr[i];
			}
			return gcd(x, gcd(rem));
		}
	}

	static int gcdFromGeeksForGeeks(int [] arr){
		int result = arr[0];
		for(int i=1; i< arr.length; i++){
			result = gcd(arr[i], result);
		}
		return result;
	}

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,16};
		System.out.println("GCD of "+ Arrays.toString(arr) + " is ="+gcd(arr));
		System.out.println("GCD of "+ Arrays.toString(arr) + " is ="+gcdFromGeeksForGeeks(arr));

		int [] arr2 = {32, 24};
		System.out.println("GCD of "+ Arrays.toString(arr2) + " is ="+gcd(arr2));
		System.out.println("GCD of "+ Arrays.toString(arr2) + " is ="+gcdFromGeeksForGeeks(arr2));
	}
}
