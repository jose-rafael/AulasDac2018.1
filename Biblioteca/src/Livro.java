
public class Livro {

	private String titulo;
	private String resumo;
	private double preco;
	private Autor autor;

	public Livro(Autor autor) {
	    this.autor = autor;
    }

	public Livro() {
		System.out.println("Livro criado com sucesso!");
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	void exibirDetalhes() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Resumo: " + resumo);
		System.out.println("PreçoR$: " + preco);
	}
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.2) {
			return false;
		}
		this.preco -= this.preco * porcentagem;
		return true;
	}

}
