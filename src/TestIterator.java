import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		String nome1 = "Eli";
		String nome2 = "Debora";
		
		strings.add(nome1);
		strings.add(nome2);
		
		for(String nome : strings){
			if(nome.equals("Eli") || nome.equals("Debora")){
				new TestIterator().removerString(nome, strings);
			}
			
			
		}
		
		
		
		
	}
	
	public void removerString(String nome, List<String> listaDeNomes){
		Iterator iteratorprincipal = listaDeNomes.iterator();
		
		while(iteratorprincipal.hasNext()){
			String stringToRemove = (String) iteratorprincipal.next();
			if(stringToRemove.equals("Eli")){
				iteratorprincipal.remove();
			}
		}
	}
	

}
