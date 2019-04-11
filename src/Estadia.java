import java.util.Date;

public class Estadia {
	private Date dataEntrada;
	private Date dataSaida;
	private int totalDiarias;
	private double valorTotal;
	
	public void efetuarCheckin() {};
	public void calcularTotal() {};
	public void efetuarCheckOut() {}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getTotalDiarias() {
		return totalDiarias;
	}
	public void setTotalDiarias(int totalDiarias) {
		this.totalDiarias = totalDiarias;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	};
	


}
