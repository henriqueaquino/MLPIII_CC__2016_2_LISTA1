package br.com.unipe.exercicio.exercicio4;

public class FitaInfantil extends Fita {

	private Autor autor;
	
	public void setPreco(double preco) {
		this.preco = preco - (preco * 0.4);
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

		
}
