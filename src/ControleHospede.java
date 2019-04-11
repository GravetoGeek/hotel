import java.util.Scanner;

public class ControleHospede {
public static void incluirHospede() {
	Hospede hospede = new Hospede();
	Scanner input = new Scanner(System.in);
	System.out.println("Inclus�o de h�spede!");
	System.out.println("Insira o nome:");
	hospede.setNome(input.nextLine());
	System.out.println("Insira o CPF:");
	hospede.setCpf(input.nextLine());
	System.out.println("Insira a data de nascimento:");
	hospede.setDataNasc(input.nextLine());
	System.out.println("Insira o endere�o:");
	hospede.setEndere�o(input.nextLine());
	System.out.println("Insira o estado UF:");
	hospede.setEstado(input.nextLine());
	System.out.println("Insira a cidade:");
	hospede.setCidade(input.nextLine());
	System.out.println("Insira o pa�s:");
	hospede.setPais(input.nextLine());
	System.out.println("Insira o telefone:");
	hospede.setTelefone(input.nextLine());
	System.out.println("Insira o email:");
	hospede.setEmail(input.nextLine());
	
	BancoDeDados.hospedes.put(hospede.getCpf(), hospede);
};
public static void alteraHospede(String cpf) {
	Hospede hospede = new Hospede();
	Scanner input = new Scanner(System.in);
	System.out.println("Altera��o de h�spede!");
	System.out.println("Insira o nome:");
	BancoDeDados.hospedes.get(cpf).setNome(input.nextLine());
	System.out.println("Insira o CPF:");
	BancoDeDados.hospedes.get(cpf).setCpf(input.nextLine());
	System.out.println("Insira a data de nascimento:");
	BancoDeDados.hospedes.get(cpf).setDataNasc(input.nextLine());
	System.out.println("Insira o endere�o:");
	BancoDeDados.hospedes.get(cpf).setEndere�o(input.nextLine());
	System.out.println("Insira o estado UF:");
	BancoDeDados.hospedes.get(cpf).setEstado(input.nextLine());
	System.out.println("Insira a cidade:");
	BancoDeDados.hospedes.get(cpf).setCidade(input.nextLine());
	System.out.println("Insira o pa�s:");
	BancoDeDados.hospedes.get(cpf).setPais(input.nextLine());
	System.out.println("Insira o telefone:");
	BancoDeDados.hospedes.get(cpf).setTelefone(input.nextLine());
	System.out.println("Insira o email:");
	BancoDeDados.hospedes.get(cpf).setEmail(input.nextLine());
};
public static void obterHospedes (String cpf) {
	Scanner input = new Scanner(System.in);
	if(BancoDeDados.hospedes.containsKey(cpf)) {
		BancoDeDados.hospedes.get(cpf);
		System.out.println("Retornar h�spede!");
		System.out.println(BancoDeDados.hospedes.get(cpf).getNome());
		System.out.println(BancoDeDados.hospedes.get(cpf).getCpf());
		System.out.println(BancoDeDados.hospedes.get(cpf).getDataNasc());
		System.out.println(BancoDeDados.hospedes.get(cpf).getEndere�o());
		System.out.println(BancoDeDados.hospedes.get(cpf).getEstado());
		System.out.println(BancoDeDados.hospedes.get(cpf).getCidade());
		System.out.println(BancoDeDados.hospedes.get(cpf).getPais());
		System.out.println(BancoDeDados.hospedes.get(cpf).getTelefone());
		System.out.println(BancoDeDados.hospedes.get(cpf).getEmail());
		
	}

	
	
};


}
