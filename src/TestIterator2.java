import java.util.Iterator;
import java.util.List;

public class TestIterator2 {
	
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
