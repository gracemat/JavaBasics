package fifth.session;

import java.util.ArrayList;

public class FirstLast {

	public static void main(String[] args) {
		ArrayList<String> firstlast = new ArrayList<>();
		int l = firstlast.size();
		System.out.println(l);
		firstlast.add(0, "Sam");//inserting at first
		firstlast.add(1, "Ho");
		firstlast.add(2, "Hou");
		firstlast.add(3, "Hous");
		firstlast.add(4, "Houst");
		int size = firstlast.size();
		System.out.println(size);
		firstlast.add((firstlast.size()), "Houston");//inserting at last
		System.out.println(firstlast.get(0));
		System.out.println(firstlast.size());
		System.out.println(firstlast.get((firstlast.size() - 1)));//printing last element
		System.out.println(firstlast.get(4));
		System.out.println(firstlast);

	}

}
