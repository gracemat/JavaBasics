package fifth.session;

import java.util.ArrayList;

public class Colors {
	/*
	 * public static final String ANSI_RESET = "\u001B[0m"; public static final
	 * String ANSI_BLACK = "\u001B[30m"; public static final String ANSI_RED =
	 * "\u001B[31m"; public static final String ANSI_GREEN = "\u001B[32m"; public
	 * static final String ANSI_YELLOW = "\u001B[33m"; public static final String
	 * ANSI_BLUE = "\u001B[34m"; public static final String ANSI_PURPLE =
	 * "\u001B[35m"; public static final String ANSI_CYAN = "\u001B[36m"; public
	 * static final String ANSI_WHITE = "\u001B[37m";
	 */
	public static void main(String[] args) {
			ArrayList color = new ArrayList();
			color.add("RED");
			color.add("ORANGE");
			color.add("Yellow");
			color.add("Green");
			color.add("Blue");
			color.add("Indigo");
			color.add("Violet");
			System.out.println(color);			
		 for(int i=0;i<color.size();i++) 
		 {
			 System.out.println(color.get(i)); 
		 }

		//System.out.println(Colors.ANSI_PURPLE + "example" + Colors.ANSI_RESET);
	}

}
