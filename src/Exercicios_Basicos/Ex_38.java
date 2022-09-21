/** 
 * 
 * Elabore um programa que permita receber um número inteiro via teclado e 
 * imprimir se o número recebido é primo ou não. Sabe-se que um número é primo 
 * quando é apenas divisível por 1 e por ele mesmo. 
 * 
 * Entrada = Será recebido um número inteiro positivo 
 * 
 * Saída = Para cada caso de teste, imprima “É PRIMO” ou “NÃO É PRIMO”. 
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int tot = 0; 
		int n; 
		
		int i; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		for(i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				
				tot++; 
			}
		}
		
		if(tot == 2) {
			
			System.out.printf("O Número [%d] é primo ", n);
			
		} else {
			
			System.out.printf("O Número [%d] não é primo", n);
		}
	} 
}
