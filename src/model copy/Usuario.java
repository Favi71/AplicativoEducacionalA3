package model;

public class Usuario {

	//Atributos
	private String nome;
	private String dataNasc;
	private String endereco;
	private String telefone;
	private String email;
	
	//Construtores
	public Usuario() {
		super();
	}
	public Usuario(String nome, String dataNasc, String endereco, String telefone, String email) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	public Usuario(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
