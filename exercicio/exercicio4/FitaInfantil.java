package br.com.unipe.exercicio.exercicio4;

public class FitaInfantil extends Fita {

	private Autor autor = new Autor();
	
	public void setPreco(double preco) {
		this.preco = preco - (preco * 0.4);
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor.setNome(autor);
	}
	
	
}
