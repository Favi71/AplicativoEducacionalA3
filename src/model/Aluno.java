package model;

public class Aluno extends Usuario {

	//Atributos
	private int numMatricula;

	//Construtores
	public Aluno() {
		super();
	}
	public Aluno(int numMatricula, String nome, String dataNasc, String endereco,String telefone, String email) {
		super(nome, dataNasc, endereco, telefone, email);
		this.numMatricula = numMatricula;
	}
	//Getter e Setters
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
}
