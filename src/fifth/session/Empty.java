package fifth.session;

import java.util.ArrayList;

//10. Write a Java program to empty an array list.
public class Empty {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(9);
		l.add(18);
		l.add(27);
		l.add(36);
		l.add(45);
		l.add(54);
		l.add(63);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		l.clear();
		System.out.println("After clear method");
		for (int j = 0; j < l.size(); j++) {
			System.out.println(l.get(j));
		}
		System.out.println(l.isEmpty());//using isEmpty method to clarify
	}
}

		/*Tried without using clear method
		 * 
		 * for(int i=0,r=0;i<l.size();i++,r++) {if(r<(l.size())-1)
		 * {if((i+2)>=(l.size()-1)) break; else { int k=i+1;
		 * 
		 * l.remove(i); l.remove(k);
		 * 
		 * l.remove(i+1); l.remove(i+2); l.remove(i+3);
		 * 
		 * //System.out.println(l.get(i)); } } } System.out.println(l);
		 */
	