/** 
 * Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares 
 * consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso. 
 * 
 * Entrada = A entrada será um valor inteiro positivo.
 * 
 * Saída  = A saída será uma sequência de seis números ímpares.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int x, cont = 0;
		
		System.out.println("Informe um número para x: ");
		x = sc.nextInt();
		
		while(cont < 6) {
			
			if(x % 2 == 1) {
				
				System.out.println(x);
				cont++;
			}
			
			x++;
		}
	}

}
