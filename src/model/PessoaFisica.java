package model;

public class PessoaFisica extends Pessoa {
	private String nome;
	private long cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("\nFalando - Pessoa Fisica \n");
	}
	
    

}
