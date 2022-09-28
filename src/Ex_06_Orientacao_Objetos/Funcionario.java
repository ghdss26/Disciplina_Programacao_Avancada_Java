package Ex_06_Orientacao_Objetos;

import java.util.Date;

public class Funcionario {
	
	private Integer matricula; 
	private String nome_completo; 
	private Integer cpf; 
	private Date dataNascimento; 
	private Integer sexo;
	private double salario;
	private Integer telefone;
	
	public Funcionario() {
		
		
	}

	public Funcionario(Integer matricula, String nome_completo, Integer cpf, Date dataNascimento, Integer sexo,
			double salario, Integer telefone) {
		super();
		this.matricula = matricula;
		this.nome_completo = nome_completo;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.salario = salario;
		this.telefone = telefone;
	}

	public Integer getMatricula() {
		
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		
		this.matricula = matricula;
	}

	public String getNome_completo() {
		
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		
		this.nome_completo = nome_completo;
	}

	public Integer getCpf() {
		
		return cpf;
	}

	public void setCpf(Integer cpf) {
		
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		
		this.dataNascimento = dataNascimento;
	}

	public Integer getSexo() {
		
		return sexo;
	}

	public void setSexo(Integer sexo) {
		
		this.sexo = sexo;
	}

	public double getSalario() {
		
		return salario;
	}

	public void setSalario(double salario) {
		
		this.salario = salario;
	}

	public Integer getTelefone() {
		
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		
		this.telefone = telefone;
	}
	
	
}
