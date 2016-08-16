package br.com.unipe.exercicio.exercicio5;

public class VeiculoPasseio extends Veiculo {
	
	private boolean arCondicionado;
	private int quantidadePortas;
	private Pessoa proprietario = new Pessoa();
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario.setNome(proprietario);
	}
	
	

}
