package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	private String razaoS;
	private String cnpj;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String razaoS, String cnpj) {
		super();
		this.razaoS = razaoS;
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, int idade, String email, double renda, String razaoS, String cnpj) {
		super(nome, idade, email, renda);
		this.razaoS = razaoS;
		this.cnpj = cnpj;
	}

	public String getRazaoS() {
		return razaoS;
	}

	public void setRazaoS(String razaoS) {
		this.razaoS = razaoS;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String identificador(){
		return "PJ";
	}
	
}
