import java.util.Map;
import java.util.Scanner;

public class ControleServico {

	public static void incluirServico() {
		System.out.println("------------------------------------");
		System.out.println("Inclus�o de Servi�o!");
		System.out.println("Insira a descri��o:");
		System.out.println("------------------------------------");
		Servico servico = new Servico();
		Scanner input = new Scanner(System.in);
		servico.setDescricao(input.nextLine());
		System.out.println("Insira o valor do servi�o.");
		servico.setValorServico(input.nextDouble());
		BancoDeDados.servicos.put(servico.getIdServico(), servico);
	}
	
	public static void alterarServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Altera��o de Servi�o!");
			System.out.println("Insira a id do servi�o:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				System.out.println("Insira a nova descri��o.");
				BancoDeDados.servicos.get(idServico).setDescricao(input.nextLine());
				System.out.println("Insira o novo valor.");
				BancoDeDados.servicos.get(idServico).setValorServico(input.nextDouble());
				System.out.println("Servi�o alterado com sucesso!");
			}else {
				System.out.println("N�o h� servi�o para a id informada.");
			}
			
			
		}else {
			System.out.println("N�o h� servi�o cadastrado!");
		}
		
		
	}

	public static void obterServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Busca de servi�o!");
			System.out.println("Insira a id do servi�o:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				System.out.println(BancoDeDados.servicos.get(idServico).getDescricao());
				System.out.println(BancoDeDados.servicos.get(idServico).getValorServico());
			}else {
				System.out.println("N�o h� servi�o cadastrado para esta id.");
			}
		}else {
			System.out.println("N�o h� servi�o cadastrado!");
		}

	}

	public static void obterListaServicos() {
		for(Map.Entry<String,Servico> servico: BancoDeDados.servicos.entrySet()) {
			System.out.println(String.format("ID: %s, Servi�o: %s, Valor: %s",servico.getKey(),servico.getValue().getDescricao(),servico.getValue().getValorServico()));			
		}
	}
	
	public static void excluirServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Exclus�o de servi�o!");
			System.out.println("Insira a id do servi�o:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				BancoDeDados.servicos.remove(idServico);
				System.out.println("Servi�o removido com sucesso!");
			}else {
				System.out.println("N�o h� servi�o cadastrado para esta id.");
			}
		}else {
			System.out.println("N�o h� servi�o cadastrado!");
		}
	}
	
	
	
}
