public class Quarto {
	private String numQuarto = Integer.toString(BancoDeDados.quartos.size()+1);
	private String descricao;
	private double valorDiaria;
	private boolean disponivel;
	
	public void atualizarQuarto() {}

	public String getNumQuarto() {
		return this.numQuarto;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorDiaria() {
		return this.valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public boolean isDisponivel() {
		return this.disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	};
	
	
}
