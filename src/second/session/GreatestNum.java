package second.session;

/*Test Data
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Input the 4th number: 90

Expected Output :
The greatest: 90
*/
public class GreatestNum {
	public static void main(String[] args) {
		int a=25,b=78,c=87,d=90;
		if(a>b && a>c && a>d)
		{
			System.out.println("The greatest: "+a);
		}
		else if(b>c && b>d)
		{
			System.out.println("The greatest: "+b);
		}
		else if(c>d)
		{
			System.out.println("The greatest: "+c);
		}
		else
		{
			System.out.println("The greatest: "+d);
		}
	}

}
