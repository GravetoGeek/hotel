import java.util.Map;
import java.util.Scanner;

public class ControleServico {

	public static void incluirServico() {
		System.out.println("------------------------------------");
		System.out.println("Inclusão de Serviço!");
		System.out.println("Insira a descrição:");
		System.out.println("------------------------------------");
		Servico servico = new Servico();
		Scanner input = new Scanner(System.in);
		servico.setDescricao(input.nextLine());
		System.out.println("Insira o valor do serviço.");
		servico.setValorServico(input.nextDouble());
		BancoDeDados.servicos.put(servico.getIdServico(), servico);
	}
	
	public static void alterarServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Alteração de Serviço!");
			System.out.println("Insira a id do serviço:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				System.out.println("Insira a nova descrição.");
				BancoDeDados.servicos.get(idServico).setDescricao(input.nextLine());
				System.out.println("Insira o novo valor.");
				BancoDeDados.servicos.get(idServico).setValorServico(input.nextDouble());
				System.out.println("Serviço alterado com sucesso!");
			}else {
				System.out.println("Não há serviço para a id informada.");
			}
			
			
		}else {
			System.out.println("Não há serviço cadastrado!");
		}
		
		
	}

	public static void obterServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Busca de serviço!");
			System.out.println("Insira a id do serviço:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				System.out.println(BancoDeDados.servicos.get(idServico).getDescricao());
				System.out.println(BancoDeDados.servicos.get(idServico).getValorServico());
			}else {
				System.out.println("Não há serviço cadastrado para esta id.");
			}
		}else {
			System.out.println("Não há serviço cadastrado!");
		}

	}

	public static void obterListaServicos() {
		for(Map.Entry<String,Servico> servico: BancoDeDados.servicos.entrySet()) {
			System.out.println(String.format("ID: %s, Serviço: %s, Valor: %s",servico.getKey(),servico.getValue().getDescricao(),servico.getValue().getValorServico()));			
		}
	}
	
	public static void excluirServico() {
		Scanner input = new Scanner(System.in);
		if(BancoDeDados.servicos.size()>0) {
			System.out.println("------------------------------------");
			System.out.println("Exclusão de serviço!");
			System.out.println("Insira a id do serviço:");
			System.out.println("------------------------------------");
			String idServico = input.nextLine();
			if(BancoDeDados.servicos.containsKey(idServico)) {
				BancoDeDados.servicos.remove(idServico);
				System.out.println("Serviço removido com sucesso!");
			}else {
				System.out.println("Não há serviço cadastrado para esta id.");
			}
		}else {
			System.out.println("Não há serviço cadastrado!");
		}
	}
	
	
	
}
