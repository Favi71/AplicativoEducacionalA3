package model;

public class Curso {

	//Atributos
	private int codigo;
	private String nome;
	private String dadosCurso;
	private int codProfRespensavel;
	
	//Metodo criador
	public Curso(int codigo, String nome, String dadosCurso, int codProfRespensavel) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dadosCurso = dadosCurso;
		this.codProfRespensavel = codProfRespensavel;
	}
	//Getter e Setters
	public int getCod() {
		return codigo;
	}
	public void setCod(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDadosCurso() {
		return dadosCurso;
	}
	public void setDadosCurso(String dadosCurso) {
		this.dadosCurso = dadosCurso;
	}
	public int getCodProfRespensavel() {
		return codProfRespensavel;
	}
	public void setCodProfRespensavel(int codProfRespensavel) {
		this.codProfRespensavel = codProfRespensavel;
	}
}
