
public class Main {

	public static void main(String[] args) {

		
		//Criando objeto com construtor vazio:
		Pessoa pessoa1 = new Pessoa();
		

		//Criando objeto com parâmetros:
		Pessoa pessoa2 = new Pessoa(1, "João", 20, true, null);
		
		pessoa2.setNome("José");
		

		System.out.println("O nome da pessoa2 é " + pessoa2.getNome() + ".");
		System.out.println("A idade da pessoa2 é " + pessoa2.getIdade() + ".");
		
		
		
		Carro carro1 = new Carro(1, "gol", "vermelho", 1987, 0.0, 0.0);
		
		carro1.andar();
		
		carro1.andar(0.0, 20.0);
		
		
		
		
		
		
		

	}

}
