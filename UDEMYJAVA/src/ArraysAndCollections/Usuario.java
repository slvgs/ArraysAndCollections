package ArraysAndCollections;

public class Usuario {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
		 if(objeto instanceof Usuario) {
				Usuario outro = (Usuario)objeto; 
				boolean nomeIgual = outro.nome.equals(this.nome);
				boolean emailIgual = outro.email.equals(this.email); 

				return nomeIgual && emailIgual;
		 }else {
			 
			 return false;
				
		 }
//		return super.equals(obj);
	}
	
	//Implementando Equals dentro da classe de Usuario
	 

//	public boolean equals(Object objeto ) {
//		
//		//converti o parametro Object em usuário dentro do método 
//		//se jogar um ifelse com instanceof do objeto e usuario, se caso na classe chamar um objeto não identificado ele ira levar a false, por conta do "else".
//			
//		 if(objeto instanceof Usuario) {
//				Usuario outro = (Usuario)objeto; 
//				boolean nomeIgual = outro.nome.equals(this.nome);
//				boolean emailIgual = outro.email.equals(this.email); 
//
//				return nomeIgual && emailIgual;
//		 }else {
//			 
//			 return false;
//				
//		 }
//		
//		
//			
//		
//	}
	
	
	

}
