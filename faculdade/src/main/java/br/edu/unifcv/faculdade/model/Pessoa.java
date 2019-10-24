package br.edu.unifcv.faculdade.model;

public class Pessoa {

	private Integer ID;
	
	private String nome;

	public Pessoa() {
		
	}
	
	public Pessoa(Integer iD, String nome) {
		ID = iD;
		this.nome = nome;
		
		Object b = "Andre";
		String a = (String) b;

		
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
