package java8project;

public class loopsPractice {

	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apparel and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(str);
		printStringBackwards(str);
		System.out.println();
		printEvens();

	}
	
	public static void printCategories(String str) {
		// Brute force:
//		int first = str.indexOf("category:");
//		int firstSpace = str.indexOf(" ", first);
//		System.out.println(str.substring(first + 9, firstSpace));
//		
//		int second = str.indexOf("category:", firstSpace);
//		int secondSpace = str.indexOf(" ", second);
//		System.out.println(str.substring(second + 9, secondSpace));
//		
//		int third = str.indexOf("category:", secondSpace);
//		int thirdSpace = str.indexOf(" ", third);
//		System.out.println(str.substring(third + 9, thirdSpace));

		// DRY solution:
		int i = 0;
		while(true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start,  end));
			i = end;
		}
	}
	
	public static void printStringBackwards(String str) {
		for (int i = str.length() - 1; i > -1; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void printEvens() {
		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
	}
}
