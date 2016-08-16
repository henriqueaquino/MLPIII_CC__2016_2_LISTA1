package br.com.unipe.exercicio.exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Fatura f1 = new Fatura();
		
		System.out.println("Digite descrição do produto: ");
		f1.setDescricao(ler.nextLine());
		System.out.println("Numero do produto: ");
		f1.setNumero(ler.nextLine());
		System.out.println("Quantidade: ");
		f1.setqComprada(ler.nextInt());
		System.out.println("Preço do item: ");
		f1.setpItem(ler.nextDouble());
		System.out.println("Valor fatura: "+f1.getValorFatura()+" reais.");
	}
}
