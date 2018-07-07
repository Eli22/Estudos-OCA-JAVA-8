import java.util.ArrayList;

public class TestArrayList {
 public static void main(String[] args){
	 
	 String[] nomes = {"Eli", "Débora", "Elizinho", "João", "Maria"};
	
	 ArrayList<String> nomes2 = new ArrayList<String>();
	 nomes2.add("Eli");
	 nomes2.add("Débora");
	 nomes2.add("Elizinho");
	 nomes2.add("João");
	 nomes2.add("Maria");
	 
	 System.out.println("NOMES 1: "+nomes.toString());
	 System.out.println("NOMES 2: "+nomes2.toString());
 }
}
