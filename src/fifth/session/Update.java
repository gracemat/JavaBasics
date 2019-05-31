package fifth.session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//4. Write a Java program to update specific array element by given element.
public class Update {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		System.out.println(al.size());
		for (int i = 0; i < 9; i++) {
			al.add(i, i + 1);
		}
		System.out.println(al);
		// ArrayList<Integer> al1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,
		// 9));
		/*
		 * trying to insert elements through loop for (int i = 0; i < al.size(); i++) {
		 * int k = i + 1; al.add(i, k); } al.add(1); al.add(2); al.add(3); al.add(4);
		 * al.add(5); al.add(6); al.add(7); al.add(8); al.add(9);
		 */
		for (int j = 0; j < al.size(); j++) {
			if (al.get(j) % 3 == 0) {
				System.out.println("*");
			} else
				System.out.println(al.get(j));
		}
	}
}
