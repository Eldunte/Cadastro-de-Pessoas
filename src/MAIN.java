
public class MAIN {

	public static void main(String[] args) {
		PESSOA pessoa1 = new PESSOA("João", 27);
		
		pessoa1.setIdade(29);
		
		System.out.println("A pessoa " + pessoa1.getNome() + " foi cadastrada com sucesso");
	}

}
