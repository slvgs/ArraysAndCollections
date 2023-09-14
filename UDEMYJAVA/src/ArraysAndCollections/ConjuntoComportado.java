package ArraysAndCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	//DADOS HOMOGENOS 
	
	public static void main(String[] args) {
		
		
//		Set<String> lista = new HashSet <String>();
		SortedSet<String> lista = new TreeSet<>();
		
		//dados homogeneos, pois "amarrei" os dados em um tipo no Set e HashSet no inicio 
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucca");
		lista.add("Pedro");
		
		
		//ele nao vai na ordem de ordenação pq ele é um SET, então a ordem dos nomes sera na ordem
		//Para ir na ordem da lista, deve-se jogar um "TreeSet" no lugar do HashSet e o SortedSet no lugar do Set, o TreeSet faz parte do pacote SortedSet
		for (String candidato: lista) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(Integer num: nums ) {
			
			System.out.println(num);
		}
		
		
		
		
	}

}
