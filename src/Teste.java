import java.util.ArrayList;
import java.util.List;

/**
 * @author Eli
 *
 */
public class Teste {

	public static void main(String[] args) {

		// int[] values = new int[3];
		// values[0] = 10;
		// values[1] = new Integer(5);
		// values[2] = 15;
		// for(int i=1; i<values.length; i++) {
		// System.out.print(values[i]-values[i-1]);
		// }
		//

//		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
//		for (int[] mySimpleArray : myComplexArray) {
//			for (int i = 0; i < mySimpleArray.length; i++) {
//				System.out.print(mySimpleArray[i] + "\t");
//			}
//			System.out.println();
//		}
		

//		int x = 20;
//		while(x>0) {
//		do {
//		x -= 2;
//		} while (x>5);
//		x--;
//		System.out.print(x+"\t");
//		}
		
		
		

//			int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
//			int searchValue = 2;
//			int positionX = -1;
//			int positionY = -1;
//			PARENT_LOOP: for(int i=0; i<list.length; i++) {
//			for(int j=0; j<list[i].length; j++) {
//			if(list[i][j]==searchValue) {
//			positionX = i;
//			positionY = j;
//			break PARENT_LOOP;
//			}
//			}
//			}
//			if(positionX==-1 || positionY==-1) {
//			System.out.println("Value "+searchValue+" not found");
//			} else {
//			System.out.println("Value "+searchValue+" found at: " +
//			"("+positionX+","+positionY+")");
//			}
		
		
		
//		
//		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
//			for (char x = 'a'; x <= 'c'; x++) {
//			if (a == 2 || x == 'b')
//				continue FIRST_CHAR_LOOP;
//			System.out.print(" " + a + x);
//			}
//			}

		boolean isVerdade1 = true;
		boolean isVerdade2 = false || true;
		boolean isVerdade3 = (!true && true) || (!false && true);
		boolean isVerdade4 = !true || !(false && true);
		boolean isVerdade5 = !(false && true);
		boolean isVerdade6 = !(false && false);
		boolean isVerdade7 = false || !true || !(!true && true);
		boolean isVerdade8 = true && !false && !(!(!true || !false));
		boolean isVerdade9 = !(!false || !(false && !true)) && !true || !true;
		boolean isVerdade10 = !false && !(!(false && !true));
		
		System.out.println("1-"+isVerdade1);
		System.out.println("2-"+isVerdade2);
		System.out.println("3-"+isVerdade3);
		System.out.println("4-"+isVerdade4);
		System.out.println("5-"+isVerdade5);
		System.out.println("6-"+isVerdade6);
		System.out.println("7-"+isVerdade7);
		System.out.println("8-"+isVerdade8);
		System.out.println("9-"+isVerdade9);
		System.out.println("10-"+isVerdade10);
		
		
		
		
	}
}
