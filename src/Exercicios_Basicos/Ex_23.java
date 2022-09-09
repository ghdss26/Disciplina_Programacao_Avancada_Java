/** 
 * 
 * Faça um programa que leia dois valores inteiros (x e y) e imprima na tela o 
 * resultado das seguintes comparações entre estes dois valores, exatamente nesta ordem: 
 * x é maior que y 
 * x é igual a y 
 * x é menor que y 
 * x é diferente de y 
 * x é maior ou igual a y 
 * x é menor ou igual a y
 * 
 * Entrada = Dois números inteiros representando os valores que serão comparados.
 * 
 * Saída = 6 valores, cada um deles separados por um fim de linha, seguindo o modelo do 
 * Exemplo de Saída. Os valores possíveis são O ou 1. O valor O deve ser utilizado 
 * para indicar que o resultado da comparação é FALSA. O valor 1 deve ser utilizado 
 * para indicar que o resultado da comparação é VERDADEIRA.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x; 
		int y; 
		
		System.out.println("Informe o valor de x: "); 
		x = sc.nextInt(); 
		
		System.out.println("Informe o valor de y: ");
		y = sc.nextInt(); 
		
		if(x > y) { 
			
			System.out.println("Valor verdadeiro:  " + 1); 
			
		} else {
			
			System.out.println("Valor Falso: " + 0); 
		}
		
		if(x == y) {
			
			System.out.println("Valor Verdadeiro: " + 1); 
			
		} else {
			
			System.out.println("Valor Falso: " + 0);
		}
		
		if(x < y) {
			
			System.out.println("Valor Verdadeiro: " + 1);
			
		} else {
			
			System.out.println("Valor Falso: " + 0);
		} 
		
		if(x != y) {
			
			System.out.println("Valor Verdadeiro: " + 1);
			
		} else {
			
			System.out.println("Valor Falso: " + 0);
		} 
		
		if(x >= y) {
			
			System.out.println("Valor Verdadeiro: " + 1);
			
		} else {
			
			System.out.println("Valor Falso: " + 0);
		}
		
		if(x <= y) {
			
			System.out.println("Valor Verdadeiro: " + 1);
			
		} else {
			
			System.out.println("Valor Falso: " + 0);
		}

	}

}
