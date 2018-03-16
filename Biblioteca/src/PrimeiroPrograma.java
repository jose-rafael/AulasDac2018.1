
public class PrimeiroPrograma {
	public static void main(String[] args) {
		//double valor1 = 20.90;
		//double valor2 = 20.90;
		//double soma = (int)valor1 + (int)valor2;
		//System.out.println("A soma dos valores é: "+ soma);
		
		Autor autor1 = new Autor ();
		autor1.setNome("Erick Gama");
		autor1.setCpf("123345789");
		autor1.setEmail("erickgama@gmail.com");
		
		Livro livro1 = new Livro();
		livro1.setTitulo("Padrões de projeto");
		livro1.setResumo("Explicação sobre os oadrões de Gof");
		livro1.setPreco(100.00);
		livro1.setAutor(autor1);
		
		
		livro1.exibirDetalhes();
	
		
	}
	
	

}
