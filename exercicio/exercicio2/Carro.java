package br.com.unipe.exercicio.exercicio2;

public class Carro {

	private String cor;
	private String modelo;
	private float vAtual;
	private float vMaxima;
	
	public void ligar(float velocidade){
		this.vAtual += velocidade;
	}
	
	public void acelerar(float velocidade){
		if ((this.vAtual + velocidade) > this.vMaxima) System.out.println("Velocidade excedida ! ! !");
		this.vAtual += velocidade;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getvAtual() {
		return vAtual;
	}
	public void setvAtual(float vAtual) {
		this.vAtual = vAtual;
	}
	public float getvMaxima() {
		return vMaxima;
	}
	public void setvMaxima(float vMaxima) {
		this.vMaxima = vMaxima;
	}
}
