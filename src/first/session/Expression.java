package first.session;
/*Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output
2.138888888888889*/

public class Expression 
{
	public static void main(String[] args) 
	{
		double a=25.5,b=3.5,c=40.5,d=4.5;
		System.out.println((a*b-b*b)/(c-d));
	}

}
