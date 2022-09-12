/** 
 * 
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma 
 * sequência de 1 até Y, passando para a próxima linha a cada X números. 
 * 
 * Entrada = O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000). 
 * 
 * Saída = Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco 
 * entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco 
 * após o último valor da linha.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int X; 
		int Y; 
		
		System.out.println("Informe um número para N: ");
		X = sc.nextInt(); 
		
		System.out.println("Informe um número para Y: ");
		Y = sc.nextInt(); 
		
		for(int i = 1; i < Y; i++) {
			
			System.out.println(i); 
			
			if(i % X == 0) {
				
				System.out.println(" "); 
				
			} else {
				
				System.out.println(" ");
			}
		}

	}

}
