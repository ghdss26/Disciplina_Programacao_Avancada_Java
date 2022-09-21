
/** 
 * Elabore um programa que receba três números inteiros representando os 
 * tamanhos dos lados de um triângulo. Verifique se os números informados formam 
 * um triângulo, ou seja, cada um dos lados informados tem que ser menor que a soma 
 * dos outros dois. Em caso positivo informar qual tipo de triângulo seria formado:
 * 
 * ● Equilátero se os três lados forem iguais; 
 * ● Isósceles se dois lados forem iguais; 
 * ● Escaleno se os três lados forem diferentes.
 * 
 * Entrada = Serão recebidos três valores inteiros.
 *  
 * Saída Se os valores informados formarem lados de um triângulo será informando o tipo do 
 * triângulo, em caso contrário deverá dar a mensagem, “VALORES NÃO FORMAM UM TRIÂNGULO”.
 * 
 */
package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int a, b, c; 
		
		System.out.println("informe um número para a letra A: "); 
		a = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra B: "); 
		b = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra C: "); 
		c = sc.nextInt(); 
		
		if(a + b > c && b + c > a && c + a > b) {
			
			if(a == b && b == c) {
				
				System.out.println("Equilátero"); 
				
			} else if(a == b || b == c || c == a) {
				
				System.out.println("Isósceles"); 
				
			} else {
				
				System.out.println("Escaleno");
			}
			
		} else {
			
			System.out.println("Valores não formam um triângulo");
		}
	}

}
