import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrays {
	public static void main(String[] args){
		
		//CONVERTENDO UMA LISTA (ARRAYLIST) EM ARRAY
		
//		List<String> list = new ArrayList<>();
//		list.add("hawk");
//		list.add("robin");
//		list.add("Eli");
//		list.add("Débora");
//		
//		Object[] objectArray = list.toArray();
//		System.out.println(objectArray.length);
//		String[] stringArray = list.toArray(new String [0]);
//		System.out.println(stringArray.length);
		
		//CONVERTENDO UM ARRAY EM UMA LISTA
		
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) System.out.print(b + " "); // new test
		list.remove(1); // throws UnsupportedOperation Exception
		
		
	}

}
