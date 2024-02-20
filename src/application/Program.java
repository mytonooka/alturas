package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vet = new Pessoa[n];
		
		for (int i=0;i<n;i++) {
			sc.nextLine();
			
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);									
		}
		
		double alturaTotal = 0.0;
		int nMenores = 0;
		
		for (int i=0;i<n;i++) {
			if (vet[i].getIdade() < 16) {
				nMenores++;
			}
			alturaTotal += vet[i].getAltura();
		}
		
		Double percentualMenores = (double)nMenores / n * 100.0;
		
		double alturaMedia = alturaTotal / n;
		System.out.println();
		System.out.printf("Altura media: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);
				
		for (int i=0;i<n;i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();

	}

}
