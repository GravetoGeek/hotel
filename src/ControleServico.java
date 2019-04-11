import java.util.Scanner;

public class ControleServico {

	public void incluirItemServico() {
		Servico servico = new Servico();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inclusão de serviços!");
		System.out.println("Insira a descrição:");
		servico.setDescricao(input.nextLine());
		

	}

	public void obterQuartos() {

	}

	public void obterServicos() {

	}
}
