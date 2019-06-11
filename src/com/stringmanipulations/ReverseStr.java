package com.stringmanipulations;

public class ReverseStr {

	public static void main(String[] args) {
		String str = "racecar";
		
		System.out.println(revString(str));
		
		int revnum = 901109;
		String num = String.valueOf(revnum);
		System.out.println(revString(num));
			}
	
	public static String revString(String st) {
		String rev = " ";
		System.out.print("After Reversing: ");
		for(int i=(st.length())-1;i>=0;i--)
		{
			rev = rev+st.charAt(i);
		}
		return rev;
		}

}
