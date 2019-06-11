package com.stringmanipulations;

public class StringFunctions {
	public static void main(String[] args) {
		
		String str = "Hey I am automation king";
		
		System.out.println(str.length());//24
		
		System.out.println(str.charAt(4));//I
		
		System.out.println(str.charAt(23));//g
		
		//System.out.println(str.charAt(24));// IndexOutOfBoundsException
		
		System.out.println(str.indexOf('a'));
		
		int indofa = str.indexOf('a');
		
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		
		System.out.println(indofa);
		
		int secindofa = str.indexOf('a', str.indexOf('a')+1);
		System.out.print("Second 'a' Index is:  ");	
		System.out.println(str.indexOf('a', secindofa+1));
		
		
		String mesg = "Welcome Yashaswin user";
		
		System.out.println(mesg.substring(8,mesg.indexOf('u')));
		
		String msg = "Welcome Pradyumna user";
		
		System.out.println(msg.substring(8,msg.indexOf('u')));//it worked if there is no 'u' in admin name
		
		System.out.println(msg.substring(8,msg.length()));
		
		System.out.println(msg.substring(8,msg.length()-5));
		
		String st = " Selenium Sessions   Started !!!  ";
		System.out.println(st.trim());
		System.out.println(st.replace(" ",""));
		
		
		String custDetails = "John;31;Account Created;2010;Pat;34;2013";
		String cust[] = custDetails.split(";");
		for(int i=0;i<cust.length;i++) {
			System.out.println(cust[i]);
		}
		
		
			}
}
