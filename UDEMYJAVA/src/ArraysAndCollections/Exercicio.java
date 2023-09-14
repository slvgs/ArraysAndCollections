package ArraysAndCollections;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		//Arrays.toString(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
	
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / 3);
		System.out.println(totalAlunoA / notasAlunoA.length);
	
	
		//agr ele também tem 4 notas mas atribui os valores de forma direta
		double [] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
