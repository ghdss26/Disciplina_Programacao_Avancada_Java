/** 
 * 
 * Escreva os 20 primeiros termos da série: 1, 3, 9, 27, ... 
 * 
 * Entrada = Este programa não tem nenhuma entrada. 
 * 
 * Saída = Deverá ser exibido a sequência completa contendo 20 termos.
 * 
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] numero = new int[4]; 
		int termos = 0;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("Informe o %d número: ", i); 
			numero[i] = sc.nextInt(); 
			
		}
		
		for(int i = 0; i < 20; i++) {
			
			termos = i * i;
			System.out.print(" " + termos);
		}
	}

}
