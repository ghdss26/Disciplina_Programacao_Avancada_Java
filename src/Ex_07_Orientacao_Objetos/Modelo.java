package Ex_07_Orientacao_Objetos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Modelo {
	
	private Integer codigo; 
	private String marca;
	private String nome;
	private double motor;
	private Integer serie;
	
	private Set<Carro> carro = new HashSet<>();
	
	public Modelo() {
		
		
	}

	public Modelo(Integer codigo, String marca, String nome, double motor, Integer serie) {
		
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.nome = nome;
		this.motor = motor;
		this.serie = serie;
	}

	public Integer getCodigo() {
		
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		
		this.codigo = codigo;
	}

	public String getMarca() {
		
		return marca;
	}

	public void setMarca(String marca) {
		
		this.marca = marca;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public double getMotor() {
		
		return motor;
	}

	public void setMotor(double motor) {
		
		this.motor = motor;
	}

	public Integer getSerie() {
		
		return serie;
	}

	public void setSerie(Integer serie) {
		
		this.serie = serie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, marca, motor, nome, serie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(marca, other.marca)
				&& Double.doubleToLongBits(motor) == Double.doubleToLongBits(other.motor)
				&& Objects.equals(nome, other.nome) && Objects.equals(serie, other.serie);
	}
	
	
}
