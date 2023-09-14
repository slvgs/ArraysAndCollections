package ArraysAndCollections;

import java.util.Scanner;

public class MatrizDesafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inforem a quantidade de alunos:");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Inforem quantas notas por aluno:");
		int qtdNotas = entrada.nextInt();
		
		double [][] notasAlunos = new double [qtdAlunos][qtdNotas];
		double total = 0;
		for (int a = 0; a < notasAlunos.length; a++) {
			for (int n = 0; n < notasAlunos[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d", n+ 1, a + 1);
				notasAlunos [a] [n]= entrada.nextDouble();
				total += notasAlunos[a][n];
			}	
			
			//O que acontece é o seguinte, o primeiro for que representa os alunos vai ficar no laço o mesmo número de vezes do array externo da matriz, 
			//que nesse caso é o número de alunos. Enquanto que no n que está dentro do segundo for,
			//o laço precisa ser executado para cada nota de cada aluno, certo?

			//O que o índice a representa lá, notasDaTurma[a].length, são as notas de cada aluno daquele índice, ou seja, do índice [a] naquela execução.

			//Em resumo, o notasDaTurma.length passa uma vez em cada aluno e o notasDaTurma[a].length passa uma vez em cada nota do aluno [a].
			
		}
		
		
		
		double media = total / (qtdAlunos * qtdNotas);
		
		System.out.println("A media da turma é: " + media);
		
	
		
		
		
		
		
		
		entrada.close();
	}

}
