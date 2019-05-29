package first.session;

/*a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3*/ 
/*Expected Output :
43 
1 
19 
13
*/

public class Calculate 
{
	public static void main(String[] args)
	{
		int a=-5,b=8,c=6;
		int x=55,y=9;
		int p=20,q=-3,r=5,s=8;
		int i=15,j=3,k=2;
		
		System.out.println(a+b*c);
		System.out.println((x+y)%y);
		System.out.println(p+q*r/s);
		System.out.println(r+i/j*k-s%j);		
	}

}
