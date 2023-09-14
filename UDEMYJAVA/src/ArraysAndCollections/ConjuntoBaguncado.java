package ArraysAndCollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	//COLLECTIONS SET 
	//DADOS HETEROGENEOS 
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		
		//ele vai converter os tipos primitivos para uma classe do tipo double, um wrapper
		conjunto.add(1.2); //double -> Double
		conjunto.add(true);// boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		//se caso eu quiser jogar um elemento duplicado ele não irá repeti-lo e ainda assim continuara com 5 elementos
		//exemplo: 
		conjunto.add('x');
		
		//dentro da collections hashSet não existe o lenght, apenas o size 
		System.out.println("O Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("O Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		// conjunto.addAll(nums);// união entre dois conjuntos
		
		conjunto.retainAll(nums); // o que tiver em comum entre os dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();// para limpar tudo que estiver em conjunto
		System.out.println(conjunto);


		

		
	}

}
