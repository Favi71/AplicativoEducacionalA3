package model;

public class Professor extends Usuario{

	//Atributos
	private int cod;

	//Construtores
	public Professor(int cod, String nome, String dataNasc, String endereco,String telefone, String email) {
		super(nome, dataNasc, endereco, telefone, email);
		this.cod = cod;
	}
	public Professor() {
		super();
	}
	
	//Getter e Setters
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
}
