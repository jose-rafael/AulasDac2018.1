
public class Ebook extends Livro{
	
	private String waterMark;
	
	public Ebook (Autor autor) {
		super(autor);
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	public String getWaterMark() {
		return waterMark;
	}
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}
		return super.aplicaDesconto(porcentagem);
	}

}
