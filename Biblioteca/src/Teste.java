
public class Teste {
	public static void main(String[] args) {
		Autor autor1 = new Autor();
		autor1.setNome("Jose Rafael");
		
		Livro livro1 = new Livro(autor1);
		livro1.setPreco(80.90);
		
		if(!livro1.aplicaDesconto(0.2)) {
			System.out.println("Desconto no livro não pode ser maior do que 20%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro1.getPreco());
		}
		
		Ebook ebook1 = new Ebook(autor1);
		ebook1.setPreco(60.90);
		if(!ebook1.aplicaDesconto(0.1)) {
			System.out.println("Desconto no ebook não pode ser maior do que 10%");
		}else {
			System.out.println("Valor do ebook com desconto: " + ebook1.getPreco());
		}
	}

}
