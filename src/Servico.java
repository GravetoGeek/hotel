public class Servico {
	private String idServico = Integer.toString(BancoDeDados.servicos.size()+1);
	private double valorServico;
	private String descricao;

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getIdServico() {
		return idServico;
	}

	/*public void setIdServico() {
		this.idServico = Integer.toString(BancoDeDados.servicos.size()+1);
	}*/
	

	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", valorServico=" + valorServico + ", descricao=" + descricao + "]";
	}


	
	
}
