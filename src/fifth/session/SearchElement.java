package fifth.session;
import java.util.ArrayList;
//Write a Java program to search an element in a array list.
public class SearchElement {
	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList<>(9);
		elements.add(100);
		elements.add(200);
		elements.add(300);
		elements.add(400);
		elements.add(500);
		elements.add(600);
		elements.add(700);
		elements.add(800);
		elements.add(900);
		int find = 800;
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) == find) {
				System.out.println("Element " + find + " found at " + i + "th position");
			}
		}

	}

}
