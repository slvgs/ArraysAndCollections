package TratamentoDeExcecao;

public class ChechadaVsNãoChecada {

	public static void main(String[] args) {
		
		
		try {
			geraErro1();
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	
		
		try {
			geraErro2();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim.");
		
		
	}
	
	//Excecão não checada ou não verificada 
	static void geraErro1() {
		
		throw new RuntimeException("Ocorreu um erro bem legal! #01");
		//toda classe que termina com expection é filha da classe expection 
		//não é obrigado tratar o erro 
	}
	
	//Exceção checada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal! #02");
		//quando colocado o "throw" quer dizer que estamos lançando essa excecao
		//mas quando a excecao é checada deve-se "assinar/declarar" que temos uma excecao checada 
		//após o nome do método jogar o throws Exception
		
	}
}
