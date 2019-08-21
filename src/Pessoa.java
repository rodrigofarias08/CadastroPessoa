
public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;
	
	private Boolean tomouCafe;
	
	private Carro carro;
	
	
	
	
	
	
	
	//Método construtor vazio
	// os métodos construtores tem o mesmo nome da classe
	// os métodos construtores servem para iniciar atributos e
	// executar ações iniciais do objeto.
	public Pessoa() {
		super();
	}
	
	
	
	

	//Método construtor com campos
	public Pessoa(Integer id, String nome, Integer idade, Boolean tomouCafe, Carro carro) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.tomouCafe = tomouCafe;
		this.carro = carro;
	}


	
	

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Boolean getTomouCafe() {
		return tomouCafe;
	}
	public void setTomouCafe(Boolean tomouCafe) {
		this.tomouCafe = tomouCafe;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

	public void tomarCafe() {
		this.tomouCafe = true;
		
	}
	public void ficarComFome() {
		this.tomouCafe = false;
		
	}
	
	
	
	
	
	
	
}
