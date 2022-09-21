/** 
 * 
 * Elabore um programa que leia o nome e a idade de cinco pessoas e apresente: 
 * a maior idade, nome da pessoa mais nova, média das idades.
 * 
 * Entrada = A entrada deve conter os cinco pares de valores Nome (String) e Idade (float).
 * 
 * Saída = Seu programa deverá imprimir a Maior idade, Nome da pessoa mais nova, Média das idades. 
 * 
 */

package Exercicios_Basicos;


import java.util.Scanner;

public class Ex_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double idade; 
		double maior_idade = 0;
		double menor_idade = 0;
		double soma = 1;
		
		int cont;
		
		String nome;
		String nome_mais_novo = "";
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Informe o %d nome da pessoa: ", i); 
			nome = sc.next(); 
			
			System.out.printf("Informe a %d idade da pessoa: ", i); 
			idade = sc.nextDouble();	
			
			if(i == 1 || idade > maior_idade) {
				
				maior_idade = idade; 
			}
			
			if(i == 1 || idade < menor_idade) {
				
				menor_idade = idade;
				nome_mais_novo = nome;
			}
			
			soma = soma + idade;
		}
		
		System.out.println("Maior idade: " + maior_idade); 
		System.out.println("Nome da pessoa mais nova: " + nome_mais_novo); 
		System.out.println("Média das idades: " + (soma / 5)); 
	}

}
