package fifth.session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//9. Write a Java program of swap two elements in an array list.
public class Swap {
	public static void main(String[] args) {
		List<Double> swap = new ArrayList<Double>();
		swap = Arrays.asList(11.21, 34.56, 56.78, 66.09, 100.78, 32.41);
		System.out.println("Before Swapping : " + swap);

		int firstSwap = 2, secondSwap = 4;
		System.out.println("After Swapping 2 positions:: " + firstSwap + " and " + secondSwap);
		for (int i = 0; i < swap.size(); i++) { // int temp = firstSwap; firstSwap=secondSwap; secondSwap=temp;
			if (i == firstSwap) {
				System.out.println(swap.get(secondSwap));
			} else if (i == secondSwap) {
				System.out.println(swap.get(firstSwap));
			} else {
				System.out.println(swap.get(i));
			}
		}
	}

}
