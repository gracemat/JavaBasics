package fifth.session;
//8. Write a Java program to extract a portion of a array list.
import java.util.ArrayList;
import java.util.Arrays;
public class Portion {
public static void main(String[] args) {
	ArrayList<String> data = new ArrayList(Arrays.asList("Name","Age","SSN","Address","Ph","DOB","Proffession"));
	data.trimToSize();
	System.out.println(data.size());
	System.out.println(data);
	int beginIndex=2,endIndex=5;
	System.out.print("Data between " +beginIndex +" to " +endIndex +"-->");
	for(int i = beginIndex;i<=endIndex;i++)
	{
		System.out.print("\t"+data.get(i));
	}
}
}
