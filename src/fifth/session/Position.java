package fifth.session;

import java.util.ArrayList;
import java.util.Arrays;

public class Position {
	public static void main(String[] args) {
		ArrayList<String> position = new ArrayList(Arrays.asList("Om","Lee","Isha","David","Yashas"));
		System.out.println(position);
		
		for(int i=0;i<position.size();i++)
		{
			System.out.println("Element at Position "+i +" is "+position.get(i));
			
		}
		
	}

}
