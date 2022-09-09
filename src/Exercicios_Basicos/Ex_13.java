/** 
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.
 * 
 * Entrada
   Neste problema extremamente simples de repetição não há entrada.
   
   Saída
   Imprima todos os números pares entre 1 e 100, Inclusive se for o caso, um em cada linha.
   
 */

package Exercicios_Basicos;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Números são: ");
		for(int i = 0; i < 100; i++) {
			
			if( i % 2 == 0) {
				
				System.out.println(i);
			}
		}
	}

}
