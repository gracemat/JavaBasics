package fifth.session;

import java.util.ArrayList;

public class ReverseArr {
	public static void main(String[] args) {
		ArrayList<Float> rev = new ArrayList<Float>();
		rev.add(21.3f);
		rev.add(33.5f);
		rev.add(97.8f);
		rev.add(42.1f);
		rev.add(100.4f);
		rev.add(90.1f);
		System.out.println("Insertion Order" +rev);
		System.out.println("Reverse Order : ");
		for(int i=(rev.size()-1);i>=0;i--)
		{
			System.out.print(rev.get(i) + "\t");
		}
		
		}

}
