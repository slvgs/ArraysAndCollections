package ArraysAndCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas:");
		
		int quantidadeNotas = entrada.nextInt();
		
		double [] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("informe a nota " +( i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		//media com foreach
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A media eh " + (total / notas.length));
		
		
		
		entrada.close();
	}

}
