package Personalizada;


//existe um processo no java chamado serialização, é você tranformar um objeto em java na memória em valor textual.   
@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	
	public NumeroNegativoException(String nomeDoAtributo) {		// TODO Auto-generated constructor stub
		this.nomeDoAtributo = nomeDoAtributo;
	
	}
	
	
	public String getMessage(){
		return String.format("O atributo %s está negativo", nomeDoAtributo);
	}	

}
