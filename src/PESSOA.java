
public class PESSOA {
	
	private String nome;
	private int idade;
	
	public PESSOA(String nome, int idade) { //método constutor com campos
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public PESSOA() { //método construtor vazio
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	}

	
	

