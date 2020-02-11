package Lab4;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
public class Task3 {

	public static void main(String[] args) {
		int start = 0;
		int end = 7;
		
		for (int midNum = 1; midNum <= 128; midNum += midNum) {
			
			for(int lWhiteSpace = 0; lWhiteSpace < end; lWhiteSpace++) {
				System.out.print("    ");
			}
			
			for (int x = 1; x <= midNum; x+=x) {
				System.out.printf("%4d", x);
			}
			
			for (int s  = start;  s > 0; s /= 2) {
				System.out.printf("%4d", s);
			}
			
			System.out.println();
			end--;
			start = midNum;
		}
		
	}

}
