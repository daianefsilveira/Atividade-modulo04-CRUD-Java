package model;

public class Pessoas {

	private int codPessoa;
	private String nome;
	private String cpf;

	public Pessoas() {
		super();
	}
	
	public Pessoas(int codPessoa, String nome, String cpf) {
		super();
		this.codPessoa = codPessoa;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getCodPessoa() {
		return codPessoa;
	}
	
	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
