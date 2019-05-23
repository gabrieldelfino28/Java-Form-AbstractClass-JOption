package view;

import javax.swing.JOptionPane;
import model.PessoaFisica;
import model.PessoaJuridica; 

public class Execucao {
	public static void main(String args[]) {
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		JOptionPane.showMessageDialog(null, "Cadastro de Pessoa Física");
		
		pf.falar();
		pf.setNome(JOptionPane.showInputDialog("Digite o seu Nome"));
		System.out.println("Nome: " + pf.getNome());
		
		pf.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o seu CPF")));
		System.out.println("CPF: " + pf.getCpf());
		
		pf.setEndereco(JOptionPane.showInputDialog("Digite o seu Endereço"));
		System.out.println("Endereço: " + pf.getEndereco());
		
		pf.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite o seu CEP")));
		System.out.println("Cep: " + pf.getCep());
		
		pf.setBairro(JOptionPane.showInputDialog("Digite o Bairro onde você mora"));
		System.out.println("Bairro: " + pf.getBairro());
		
		pf.setEstado(JOptionPane.showInputDialog("Digite o Estado onde você mora"));
		System.out.println("Estado: " + pf.getEstado());
		
		pf.setCidade(JOptionPane.showInputDialog("Digite a Cidade onde você mora"));
		System.out.println("Cidade: " + pf.getCidade());
		
		JOptionPane.showMessageDialog(null, "Cadastro de Pessoa Juridica");
		pj.falar();
		pj.setRazaoSocial(JOptionPane.showInputDialog("Digite o Nome da Empresa"));
		System.out.println("Razão Social: " + pj.getRazaoSocial());
		
		pj.setCnpj(Long.parseLong(JOptionPane.showInputDialog("Digite o CNPJ")));
		System.out.println("CNPJ: " + pj.getCnpj());
		
		pj.setEndereco(JOptionPane.showInputDialog("Digite o Endereço"));
		System.out.println("Endereço: " + pj.getEndereco());
		
		pj.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite o cep")));
		System.out.println("Cep: " + pj.getCep());
		
		pj.setBairro(JOptionPane.showInputDialog("Digite o Bairro"));
		System.out.println("Bairro: " + pj.getBairro());
		
		pj.setEstado(JOptionPane.showInputDialog("Digite o Estado"));
		System.out.println("Estado: " + pj.getEstado());
		
		pj.setCidade(JOptionPane.showInputDialog("Digite a Cidade"));
		System.out.println("Cidade: " + pj.getCidade());
			
		
	}
}
