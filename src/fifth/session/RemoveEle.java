package fifth.session;

//5. Write a Java program to remove the third element from a array list. 
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEle {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList(Arrays.asList("Name","Age","SSN","Address","Ph"));
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
	}

}
