package model;

public class PessoaJuridica  extends Pessoa{
	private String razaoSocial;
	private long cnpj;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public long getCnpj() {
		return cnpj;
	}


	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("\nFalando - Pessoa Juridica\n");
	}
	
}
