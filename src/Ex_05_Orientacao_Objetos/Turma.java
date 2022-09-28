package Ex_05_Orientacao_Objetos;

import java.util.Objects;

public class Turma {
	
	private String cod;
	private Integer turno;
	private Integer sala;
	
	
	public Turma() {
		
		
	}
	
	public Turma(Integer turno, Integer sala) {
		super();
		this.turno = turno;
		this.sala = sala;
	}

	public String getCod() {
		
		return cod;
	}
	
	public void setCod(String cod) {
		
		this.cod = cod;
	}
	
	public Integer getTurno() {
		
		return turno;
	}
	
	public void setTurno(Integer turno) {
		
		this.turno = turno;
	}
	
	public Integer getSala() {
		
		return sala;
	}
	
	public void setSala(Integer sala) {

		this.sala = sala;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(cod, other.cod);
	}
	
	 
}
