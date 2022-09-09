
/** 
 * Você deve fazer um programa que apresente a sequência conforme o exemplo abaixo.
 * 
 * Entrada = Não tem entrada.
 * 
 * Saída Imprima a sequência conforme exemplo abaixo.
 */
package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i, j; 
		
		for(i = 1, j = 60; j != -5; i += 3, j -= 5) {
			
			System.out.printf("L = [%d], J = [%d] \n ", i, j);
		}
	}
}
