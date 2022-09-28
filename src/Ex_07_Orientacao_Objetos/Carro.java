package Ex_07_Orientacao_Objetos;

import java.util.Date;
import java.util.Objects;

public class Carro {
	
	private String chassi; 
	private String cor; 
	private Integer anoFabricacao; 
	private Integer anoModelo;
	private Date dataEntrada;
	
	public Carro() {
		
		
	}
	
	public Carro(String chassi, String cor, Integer anoFabricacao, Integer anoModelo, Date dataEntrada) {
		
		super();
		this.chassi = chassi;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.dataEntrada = dataEntrada;
		
	}

	public String getChassi() {
		
		return chassi;
	}

	public void setChassi(String chassi) {
		
		this.chassi = chassi;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		
		this.cor = cor;
	}

	public Integer getAnoFabricacao() {
		
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		
		this.anoModelo = anoModelo;
	}

	public Date getDataEntrada() {
		
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		
		this.dataEntrada = dataEntrada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoFabricacao, anoModelo, chassi, cor, dataEntrada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(anoFabricacao, other.anoFabricacao) && Objects.equals(anoModelo, other.anoModelo)
				&& Objects.equals(chassi, other.chassi) && Objects.equals(cor, other.cor)
				&& Objects.equals(dataEntrada, other.dataEntrada);
	}
}
