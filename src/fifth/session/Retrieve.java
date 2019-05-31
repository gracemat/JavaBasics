package fifth.session;

import java.util.ArrayList;

public class Retrieve {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<Integer>(11);
	num.add(1);
	num.add(11);
	num.add(2);
	num.add(22);
	num.add(3);
	num.add(33);
	num.add(4);
	num.add(44);
	num.add(5);
	num.add(55);
	num.add(6);
	int givenIndex = 10;
	int getNum = num.get(givenIndex);
	System.out.println("Number at Specified index-"+givenIndex +" is: "+getNum);
	
	}
}
