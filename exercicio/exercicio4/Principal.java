package br.com.unipe.exercicio.exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Autor autor = new Autor();
		FitaLancamento fL = new FitaLancamento();
		FitaInfantil fI = new FitaInfantil();
		
		System.out.println("Fita Lancamento");
		System.out.println("Digite: ");
		System.out.println("Titulo: ");
		fL.setTitulo(ler.nextLine());
		System.out.println("Categoria: ");
		fL.setCategoria(ler.nextLine());
		System.out.println("Preço: ");
		fL.setPreco(ler.nextDouble());
		ler.nextLine();
		System.out.println("Autor: ");
		autor.setNome(ler.nextLine());
		fL.setAutor(autor);
		
		System.out.println("Fita Infantil");
		System.out.println("Digite: ");
		System.out.println("Titulo: ");
		fI.setTitulo(ler.nextLine());
		System.out.println("Categoria: ");
		fI.setCategoria(ler.nextLine());
		System.out.println("Preço: ");
		fI.setPreco(ler.nextDouble());
		ler.nextLine();
		System.out.println("Autor: ");
		autor.setNome(ler.nextLine());
		fI.setAutor(autor);
	}
}
