package Personalizada;

import TratamentoDeExcecao.Aluno;

public class Validar {
	
	private Validar () {
	}
	
	
	@SuppressWarnings("unused")
	public static void aluno (Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
			
		}
		if (aluno.nome  == null) {
			throw new StringVaziaException("nome");
			
		}
		if (aluno.nota == null) {
			throw new NumeroNegativoException("nota");
			
		}
		
		
	};

}
