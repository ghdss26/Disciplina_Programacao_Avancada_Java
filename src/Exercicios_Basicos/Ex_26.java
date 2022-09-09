/** 
 * 
 * Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para 
 * poder andar neles. O parque UNINASSAU possui 3 brinquedos que possuem essa limitação: 
 * 
 * Barca Viking: 1,5m de altura e 12 anos. 
 * Elevator of Death: 1,4m de altura e 14 anos. 
 * Final Killer: 1,7m de altura ou 16 anos.
 * 
 * Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos 
 * brinquedos ele pode andar.
 * 
 * Entrada Dois valores um real (float) A e um inteiro(int) I, representando a altura (em cm) e a 
 * idade, respectivamente. 
 * 
 * Saída O número de brinquedos que ele pode andar no parque.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_26 {
	
	public static void main(String[] args) {
		
		float a; 
		int i; 
		
		float soma = 1; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um número para a altura: ");
		a = sc.nextFloat(); 
		
		System.out.println("Informe um número para a idade: ");
		i = sc.nextInt(); 
		
		if(a >= 1.5 && i >= 12) {
			
			soma = soma + 1;
			
		} else if(a >= 1.4 && i >= 14) {
			
			soma = soma + 1;
			
		} else if(a >= 1.7 && i >= 16) {
			
			soma = soma + 1; 
		}
		
		System.out.println(soma);
	}
}
