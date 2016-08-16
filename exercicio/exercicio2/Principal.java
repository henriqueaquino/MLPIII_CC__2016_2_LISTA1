package br.com.unipe.exercicio.exercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Carro c1 = new Carro();
		
		System.out.println("Digite: ");
		System.out.println("Cor do carro: ");
		c1.setCor(ler.nextLine());
		System.out.println("Modelo: ");
		c1.setModelo(ler.nextLine());
		System.out.println("Velocidade Máxima: ");
		c1.setvMaxima(ler.nextFloat());
		c1.ligar(0);
		System.out.println("Carro ligado, digite a velocidade: ");
		c1.acelerar(ler.nextFloat());
		
	}

}
