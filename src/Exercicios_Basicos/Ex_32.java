/** 
 * 
 * Um posto de combustíveis deseja determinar qual de seus produtos tem a 
 * preferência de seus clientes. Escreva um programa para ler o tipo de combustível 
 * abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a 
 * quantidade de litros anotados em 5 abastecimentos realizados.
 * 
 * Entrada = A entrada contém um valor inteiro referente ao tipo do combustível e um outro real 
 * (float) contendo a quantidade de litros.
 * 
 * Saída = Deve ser escrito a quantidade de clientes que abasteceram cada tipo de combustível 
 * com a respectiva quantidade de litros,
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int opcao = 0; 
		int alcool = 0; 
		int diesel = 0; 
		int gasolina = 0; 
		
		double liquido_alcool = 0;
		double liquido_diesel = 0;
		double liquido_gasolina = 0;
		
		while(opcao != 4) {
			
			System.out.println("Informe um número diferente de 4: "); 
			opcao = sc.nextInt(); 
			
			while(opcao < 1 || opcao > 4) {
				
				System.out.println("Informe: 1 - Alcool, 2 - diesel, 3 - Gasolina: "); 
				opcao = sc.nextInt(); 
			
			}
			
			switch (opcao) {
			
			case 1: 
				
				alcool++;
				
				System.out.println("Informe o liquido do alcool: "); 
				liquido_alcool = sc.nextDouble();
				
				break; 
				
			case 2: 
				
				diesel++;
				
				System.out.println("Informe o liquido do diesel: "); 
				liquido_diesel = sc.nextDouble();
				
				break; 
				
			case 3: 
				
				gasolina++; 
				
				System.out.println("Informe o Liquido da Gasolina: "); 
				liquido_gasolina = sc.nextDouble();
				
				break; 
			}
			
		}
	
		System.out.println("Alcool: " + alcool + " Liquido do Alcool: " + liquido_alcool); 
		
		System.out.println("Diesel: " + diesel + " Liquido do Diesel: " + liquido_diesel); 
		
		System.out.println("Gasolina: " + gasolina + " Liquido da Gasolina: " + liquido_gasolina);
	}
}
