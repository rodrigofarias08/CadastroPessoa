
public class Main {

	public static void main(String[] args) {

		
		//Criando objeto com construtor vazio:
		Pessoa pessoa1 = new Pessoa();
		

		//Criando objeto com par�metros:
		Pessoa pessoa2 = new Pessoa(1, "Jo�o", 20, true, null);
		
		pessoa2.setNome("Jos�");
		

		System.out.println("O nome da pessoa2 � " + pessoa2.getNome() + ".");
		System.out.println("A idade da pessoa2 � " + pessoa2.getIdade() + ".");
		
		
		
		Carro carro1 = new Carro(1, "gol", "vermelho", 1987, 0.0, 0.0);
		
		carro1.andar();
		
		carro1.andar(0.0, 20.0);
		
		
		
		
		
		
		

	}

}
