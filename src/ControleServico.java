import java.util.Scanner;

public class ControleServico {

	public void incluirItemServico() {
		Servico servico = new Servico();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inclus�o de servi�os!");
		System.out.println("Insira a descri��o:");
		servico.setDescricao(input.nextLine());
		

	}

	public void obterQuartos() {

	}

	public void obterServicos() {

	}
}
