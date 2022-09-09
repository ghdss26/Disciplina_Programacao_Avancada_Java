/* 
 * 
 * Faça um programa que inverta um número inteiro com quatro algarismos.
 * 
 * Entrada = Você receberá um único número inteiro com quatro algarismos.
 * 
 * Saída = Você deve imprimir o número invertido seguido de um final de linha. Importante: se o
 * número dado for 3000 por exemplo, o invertido dele deve ser 3 e não 0003
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int n; 
		int j = 0; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		while(n > j) {
			
			j *= 10;
			j += (n % 10); 
			n /= 10; 
			
		}
		
		System.out.println("Número invertido: " + j);
	}

}
