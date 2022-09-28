/* 
 * A China está construindo um elevador espacial, que permitirá o lançamento de 
 * sondas e satélites a um custo muito mais baixo, viabilizando não só projetos de pesquisa científica como o turismo espacial. No entanto, os chineses são muito 
 * supersticiosos, e por isso têm um cuidado muito especial com a numeração dos andares do elevador: eles não usam nenhum número que contenha o dígito “4” ou a 
 * sequência de dígitos "13". Assim, eles não usam o andar 4, nem o andar 13, nem o andar 134, nem o andar 113, mas usam o andar 103. Assim, os primeiros andares 
 * são numerados 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, ... Como o elevador espacial 
 * tem muitos andares, e eles precisam enumerar todos os andares do elevador, os 
 * chineses pediram que você escrevesse um programa que, dado o andar, indica o 
 * número que deve ser atribuído a ele.
 * 
 * Entrada = Cada caso de teste consiste de uma única linha, contendo um inteiro N (1 <= N <= 1018) que indica o andar cujo número deve ser determinado. 
 * 
 * Saída Para cada caso de teste, imprima uma linha contendo um único número inteiro indicando o número atribuído ao N-ésimo andar.
 */

package Exercicios_Basicos;

import java.util.Scanner;


public class Ex_50 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int andar = 0;
		int contador = 0;
		int numero; 
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt(); 
		
		while(contador < numero) {
			
			andar++; 
			contador++;
			
			while(Integer.toString(andar).contains("4") || Integer.toString(andar).contains("13")) {
				
				andar++;
			}
		}
		
		System.out.println("Posição: " + andar);
	}
}
