package br.com.fiap.beans;

public class Pessoa {
	private String nome;
	private int idade;
	private String email;
	private double renda;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, String email, double renda, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.renda = renda;
		this.endereco = endereco;
	}
	public Pessoa(String nome, int idade, String email, double renda) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.renda = renda;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String identificador(){
		return "Indefinido";
	}
	
}
