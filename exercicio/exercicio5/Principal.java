package br.com.unipe.exercicio.exercicio5;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		VeiculoPasseio vP = new VeiculoPasseio();
		VeiculoCarga vC = new VeiculoCarga();
		
		System.out.println("Veiculo de passeio, digite: ");
		System.out.println("Placa: ");
		vP.setPlaca(ler.nextLine());
		System.out.println("Marca: ");
		vP.setMarca(ler.nextLine());
		System.out.println("Modelo: ");
		vP.setModelo(ler.nextLine());
		System.out.println("Ano: ");
		vP.setAno(ler.nextLine());
		System.out.println("Chassi: ");
		vP.setChassi(ler.nextLine());
		System.out.println("valor do km rodado: ");
		vP.setValorKmRodado(ler.nextDouble());
		ler.nextLine();
		System.out.println("Km inicial: ");
		vP.setKmInicial(ler.nextInt());
		ler.nextLine();
		System.out.println("Km final: ");
		vP.setKmFinal(ler.nextInt());
		ler.nextLine();
		System.out.println("Quantidade de portas: ");
		vP.setQuantidadePortas(ler.nextInt());
		ler.nextLine();
		System.out.println("Possui ar-condicionado: (true or false)");
		vP.setArCondicionado(ler.nextBoolean());
		ler.nextLine();
		System.out.println("Nome do proprietário: ");
		vP.setProprietario(ler.next());
		System.out.println("Valor da locação: "+vP.valorLocacao()+" reais");
		
		System.out.println("Veiculo de carga, digite: ");
		System.out.println("Placa: ");
		vC.setPlaca(ler.nextLine());
		System.out.println("Marca: ");
		vC.setMarca(ler.nextLine());
		System.out.println("Modelo: ");
		vC.setModelo(ler.nextLine());
		System.out.println("Ano: ");
		vC.setAno(ler.nextLine());
		System.out.println("Chassi: ");
		vC.setChassi(ler.nextLine());
		System.out.println("valor do km rodado: ");
		vC.setValorKmRodado(ler.nextDouble());
		ler.nextLine();
		System.out.println("Km inicial: ");
		vC.setKmInicial(ler.nextInt());
		ler.nextLine();
		System.out.println("Km final: ");
		vC.setKmFinal(ler.nextInt());
		ler.nextLine();
		System.out.println("Capacidade de carga: ");
		vC.setCapacidadeCarga(ler.nextInt());
		ler.nextLine();
		System.out.println("Valor da locação: "+vC.valorLocacao()+" reais");
		
	}

}
