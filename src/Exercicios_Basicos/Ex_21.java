/* 
 * João e Maria estão querendo obter informações sobre Os carros da sua cidade. 
 * Para isso eles pediram que você escrevesse um programa para ajudá-los. Eles vão 
 * digitar Informações de três diferentes carros. Para cada carro serão lidos o ano e a 
 * velocidade. O programa deve exibir, o ano do carro mais novo e a velocidade do 
 * mais rápido.
 * 
 * Entrada 
 * Um valor inteiro (ano) e um em ponto flutuante (velocidade). 
 * 
 * Saída 
 * Maior velocidade, maior ano e velocidade média.
 * 
 */

package Exercicios_Basicos;


import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int maior_ano = 0; 
		double maior_velocidade = 0;
		int[] ano = new int[4]; 
		double[] velocidade = new double[4]; 
		
		int i; 
		
		for(i = 1; i < ano.length; i++) {
			
			System.out.printf("Informe o [%d] ano do seu carro novo: ", i, ano[i]);
			ano[i] = sc.nextInt();
			
			System.out.printf("Informe a [%d] velocidade do seu carro novo: ", i, velocidade[i]);
			velocidade[i] = sc.nextDouble();
			
			if(ano[i] > maior_ano) {
				
				maior_ano = ano[i];
			}
			
			if(velocidade[i] > maior_velocidade) {
				
				maior_velocidade = velocidade[i];
			}
		}
		
		System.out.printf("O Maior ano do seu carro é: [%d] \n", maior_ano); 
		System.out.printf("A Maior Velocidade do seu carro é de: [%.2f] \n", maior_velocidade);
	}
}
