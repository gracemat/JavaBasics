package fourth.session;
public class CricketArray {
	public static void main(String[] args) {
		Object cricketPlayer1[] = new Object[6];
		cricketPlayer1[0] ="Dhoni";
		cricketPlayer1[1]=37;
		cricketPlayer1[2]="India";
		cricketPlayer1[3]="Jul7th-1981";
		cricketPlayer1[4]="M";
		cricketPlayer1[5]="29outof37";
		for(int player=0;player<cricketPlayer1.length;player++)
		{
			System.out.print(cricketPlayer1[player]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
		Object cricketPlayer2[]= {"David warner",32,"AUS","Oct 27th 1986","M",140.11};
		for(int player=0;player<cricketPlayer2.length;player++)
		{
			System.out.print(cricketPlayer2[player]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
		Object cricketPlayer3[]= {"Ab de Villiers",35,"SA","Feb 17th 1984","M",135.17};
		for(int player=0;player<cricketPlayer3.length;player++)
		{
			System.out.print(cricketPlayer3[player]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
		Object cricketPlayer4[] = new Object[6];
		cricketPlayer4[0] ="Dhawan";
		cricketPlayer4[1]=33;
		cricketPlayer4[2]="IND";
		cricketPlayer4[3]="Dec5th-1985";
		cricketPlayer4[4]="M";
		cricketPlayer4[5]=130.48;		
		for(int player=0;player<cricketPlayer4.length;player++)
		{
			System.out.print(cricketPlayer4[player]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
	Object cricketPlayer5[]= {"Kohli",36,"IND","Nov5th-1988","M",137.4};
	for(int player=0;player<cricketPlayer5.length;player++)
		{
			System.out.print(cricketPlayer5[player]);
			System.out.print(" ");
		}
	}

}
