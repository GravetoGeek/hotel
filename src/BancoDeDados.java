import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BancoDeDados {
	public static Map<String,Hospede> hospedes = new HashMap<String,Hospede>();
	public static Map<String,Hospede> funcionarios = new HashMap<String,Hospede>();
	public static Set<Reserva> reservas = new HashSet<Reserva>();
	public static Map<String, Servico> servicos = new HashMap<String,Servico>();
	public static Set<Estadia> estadias = new HashSet<Estadia>();
	public static Map<Integer,Quarto> quartos = new HashMap<Integer,Quarto>();
	//public static Map<String, >
	
	public BancoDeDados() {
		Hospede hospede = new Hospede();
		hospede.setNome("Eduardo");
		hospede.setCpf("35366618827");
		hospede.setDataNasc("11061989");
		hospede.setEndereço("Avenida Lindóia");
		hospede.setEstado("SP");
		hospede.setCidade("Bragança Paulista");
		hospede.setPais("Brasil");
		hospede.setTelefone("11996044681");
		hospede.setEmail("graveto.geek@hotmail.com");
		hospedes.put(hospede.getCpf(), hospede);
		Servico servico = new Servico();
		servico.setDescricao("Lavagem de até 10 peças de roupas!");
		servico.setValorServico(50);
		servicos.put(servico.getIdServico(), servico);

	}
	@Override
	public String toString() {
		return "BancoDeDados [hospedes=" + hospedes + "funcionários=" + funcionarios +" reservas="+ reservas +" servicos="+ servicos+"estadias="+ estadias+"]";
	}
	
	
	
	
	

}
