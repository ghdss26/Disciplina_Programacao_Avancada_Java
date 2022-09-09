/** 
 * 
 * Faça um programa que leia do teclado três valores inteiros e exiba o maior e
menor entre eles.

Entrada
O arquivo de entrada contém 3 (três) valores inteiros, representando os valores a
serem verificados.

Saída
Imprima o maior e menor entre os valores lidos
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		int maior; 
		int a, b, c; 
		int menor; 
		
		Scanner letra = new Scanner(System.in); 
		
		System.out.println("Informe um número para letra a: ");
		a = letra.nextInt(); 
		
		System.out.println("Informe um número para letra b: ");
		b = letra.nextInt();
		
		System.out.println("Informe um número para letra c: ");
		c = letra.nextInt();
		
		maior = a; 
		
		if (b > a && b > c) {
			
			maior = b; 
			
		} else if(c > a && c > b) {
			
			maior = c;
		}
		
		menor = a; 
		

		if (b < a && b < c) {
			
			menor = b; 
			
		} else if(c < a && c < b) {
			
			menor = c;
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}
}
