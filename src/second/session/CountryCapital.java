package second.session;
/*IF COUNTRY NAME IS INDIA
THEN PRINT New Delhi
IF COUNTRY NAME IS RUSSIA
THEN PRINT MOSCOW

--CHECK FOR 10 DIFFERENT COUNTRIES, AND IF COUNTRY IS NOT FOUND, THEN PRINT "NO COUNTRY IS DEFINED WITH COUNTRY NAME"

*/
public class CountryCapital {
	public static void main(String[] args) {
		String givenCountry="pak";
				
		if(givenCountry.equalsIgnoreCase("India"))
		{
			System.out.println("Delhi");
		}
		else if(givenCountry.equalsIgnoreCase("Russia"))
		{
			System.out.println("MOSCOW");			
		}
		else if(givenCountry.equalsIgnoreCase("USA"))
		{
			System.out.println("Washington D.C");
		}
		else if(givenCountry.equalsIgnoreCase("France"))
		{
			System.out.println("Paris");
		}else if(givenCountry.equalsIgnoreCase("Italy"))
		{
			System.out.println("Rome");
		}else if(givenCountry.equalsIgnoreCase("China"))
		{
			System.out.println("Beijing");
		}else if(givenCountry.equalsIgnoreCase("Nepal"))
		{
			System.out.println("Kathmandu");
		}else if(givenCountry.equalsIgnoreCase("Srilanka"))
		{
			System.out.println("Colombo");
		}else if(givenCountry.equalsIgnoreCase("Canada"))
		{
			System.out.println("Ottawa");
		}else if(givenCountry.equalsIgnoreCase("Australia"))
		{
			System.out.println("Canberra");
		}
		else 
		{
			System.out.println("NO COUNTRY IS DEFINED WITH " +givenCountry);
		}
	}

}
