package br.com.unipe.exercicio.exercicio4;

public class FitaLancamento extends Fita{
	
	private Autor autor = new Autor();
	
	public void setPreco(double preco) {
		this.preco = preco + (preco * 0.2);
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor.setNome(autor);
	}

	
}
