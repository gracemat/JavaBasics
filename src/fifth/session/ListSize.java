package fifth.session;

import java.util.ArrayList;

public class ListSize {

	public static void main(String[] args) {
ArrayList<Integer> capacity = new ArrayList<Integer>();

System.out.println(capacity.size());
for(int counter=0;counter<4;counter++)
{
	capacity.add(counter);
}
System.out.println(capacity.size());
capacity.trimToSize();
System.out.println(capacity.size());
	}
	}
