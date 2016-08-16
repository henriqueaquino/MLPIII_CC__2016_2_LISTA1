package br.com.unipe.exercicio.exercicio1;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int qComprada = 0;
	private double pItem = 0;
	
	public double getValorFatura (){
		double valor = 0;
		
		valor = this.pItem * this.qComprada;
		
		if (valor < 0) valor = 0;
		
		return valor;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getqComprada() {
		return qComprada;
	}
	public void setqComprada(int qComprada) {
		if (qComprada < 0) qComprada = 0;
		this.qComprada = qComprada;
	}
	public double getpItem() {
		return pItem;
	}
	public void setpItem(double pItem) {
		if (pItem < 0) pItem = 0.0;
		this.pItem = pItem;
	}

}
