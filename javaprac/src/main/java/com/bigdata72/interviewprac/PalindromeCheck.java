package com.bigdata72.interviewprac;

public class PalindromeCheck {
	static boolean isPalindrome(String s){
		boolean ret = true;
		char[] arr = s.toCharArray();
		int len = arr.length;
		for(int i=0; i< len/2; i++){
			if(arr[i] != arr[len-1-i]) {
				ret = false;
				break;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		if(isPalindrome("maaaam")){
			System.out.println("it is palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}
