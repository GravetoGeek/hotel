import java.sql.Date;
import java.util.ArrayList;

public class Reserva {
	private Date dataEntrada;
	private Date dataSaida;
	private int qtdAcompanhantes;
	
	
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
	public int getQtdAcompanhantes() {
		return qtdAcompanhantes;
	}
	public void setQtdAcompanhantes(int qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}
	
}
