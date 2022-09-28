package Ex_06_Orientacao_Objetos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Dependente {
	
	private Integer sequencial; 
	private String nome_completo; 
	private Date data_nascimento;
	private Integer sexo; 
	private boolean participaPlano; 
	
	private Set<Funcionario> funcionarios = new HashSet<>();
	
	public Dependente() {
		
	}

	public Dependente(Integer sequencial, String nome_completo, Date data_nascimento, Integer sexo,
			boolean participaPlano) {
		
		super();
		this.sequencial = sequencial;
		this.nome_completo = nome_completo;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.participaPlano = participaPlano;
		
	}

	public Integer getSequencial() {
		
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		
		this.sequencial = sequencial;
	}

	public String getNome_completo() {
		
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		
		this.nome_completo = nome_completo;
	}

	public Date getData_nascimento() {
		
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		
		this.data_nascimento = data_nascimento;
	}

	public Integer getSexo() {
		
		return sexo;
	}

	public void setSexo(Integer sexo) {
		
		this.sexo = sexo;
	}

	public boolean isParticipaPlano() {
		
		return participaPlano;
	}

	public void setParticipaPlano(boolean participaPlano) {
		
		this.participaPlano = participaPlano;
	}
}
