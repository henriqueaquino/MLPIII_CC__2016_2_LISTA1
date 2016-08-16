package br.com.unipe.exercicio.exercicio5;

public class VeiculoCarga extends Veiculo{
	
	private int capacidadeCarga;
	private Pessoa proprietario = new Pessoa();
	
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario.setNome(proprietario);;
	}
	
	

}
