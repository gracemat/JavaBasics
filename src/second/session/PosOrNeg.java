package second.session;

/*Test Data
Input number: 35 -- positive number
Input number: -11 -- negative number*/

public class PosOrNeg {
	public static void main(String[] args) {
		int x=35;//int x=-11;
		if (x==35 || x>=0)
		{
			System.out.println("positive number");
		}
		else if (x==-11 || x<0)
		{
			System.out.println("negative number");
		}
	}

}
