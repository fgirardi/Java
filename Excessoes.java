
public class Excessoes {

	private String nome;
	
	public static void main (String[] args){
	
		Excessoes excessoes = new Excessoes();
		excessoes.nome = null;
		try{
			excessoes.nome.toLowerCase();
		
		} catch(NullPointerException ex){
			System.out.println("Pegou a Excessao");
			
		}
		System.out.println("Finalizou");
	}

}

