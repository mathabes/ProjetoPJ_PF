package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {
	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) {
		PessoaJuridica objPJ = new PessoaJuridica(texto("Digite o nome da empresa"),
				inteiro("Digite a idade da empresa"),
				texto("Digite o email da empresa"),
				real("Digite a renda mensal da empresa"),
				texto("Digite a Razão Social da empresa"),
				texto("Digite o CNPJ da empresa"));
		Endereco objEPJ = new Endereco(texto("Digite o logradouro"));
		
		PessoaFisica objPF = new PessoaFisica(texto("Digite o nome da pessoa"),
				inteiro("Digite a idade da pessoa"),
				texto("Digite o email da pessoa"),
				real("Digite a renda mensal da pessoa"),
				texto("Digite o RG da pessoa"),
				texto("Digite o CPF da pessoa"));
		Endereco objEPF = new Endereco(texto("Digite o logradouro"));
		
		objPJ.setEndereco(objEPJ);
		objPF.setEndereco(objEPF);
		
		System.out.println("PESSOA JURÍDICA" +
				"\nIdentificação: " + objPJ.identificador() +
				"\nNome: " + objPJ.getNome() +
				"\nIdade: " + objPJ.getIdade() +
				"\nEmail: " + objPJ.getEmail() +
				"\nRenda Mensal: " + objPJ.getRenda() +
				"\nRazão Social: " + objPJ.getRazaoS() +
				"\nCNPJ: " + objPJ.getCnpj() +
				"\nEndereço: " + objPF.getEndereco().getLogradouro() +
				"\n\nPESSOA FÍSICA " +
				"\nIdentificação: " + objPF.identificador() +
				"\nNome: " + objPF.getNome() +
				"\nIdade: " + objPF.getIdade() +
				"\nEmail: " + objPF.getEmail() +
				"\nRenda Mensal: " + objPF.getRenda() +
				"\nRG: " + objPF.getRg() + 
				"\nCPF: " + objPF.getCpf() +
				"\nEndereço: " + objPF.getEndereco().getLogradouro());
	}
}
