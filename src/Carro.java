
public class Carro {
	
	private Integer id;
	private String modelo;
	private String cor;
	private Integer ano_fab;
	
	// Localização do carro no eixo x
	// Andar para frente significa incrementar esta variável
	// Andar para trás é decrementar
	private Double local_x;
	
	// Localização do carro no eixo y
	// Andar para direita significa incrementar esta variável
	// Andar para esquerda é decrementar
	private Double local_y;
	
	
	public Carro() {
		super();
	}
	
	public Carro(Integer id, String modelo, String cor, Integer ano_fab, Double local_x, Double local_y) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.cor = cor;
		this.ano_fab = ano_fab;
		this.local_x = local_x;
		this.local_y = local_y;
	}
	
	
	
	

	public Double getLocal_x() {
		return local_x;
	}

	public void setLocal_x(Double local_x) {
		this.local_x = local_x;
	}

	public Double getLocal_y() {
		return local_y;
	}

	public void setLocal_y(Double local_y) {
		this.local_y = local_y;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAno_fab() {
		return ano_fab;
	}
	public void setAno_fab(Integer ano_fab) {
		this.ano_fab = ano_fab;
	}
	
	
	// Andar default
	public void andar() {
		this.local_x = this.local_x + 10;
	}

	// Andar com direção
	public void andar(Double deslocamento_x, Double deslocamento_y) {
		this.local_x = this.local_x + deslocamento_x; //deslocamento no eixo x
		this.local_y = this.local_y + deslocamento_y; //deslocamento no eixo y
	}
	

}
