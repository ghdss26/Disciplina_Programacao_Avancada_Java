/** 
 * 
 * Você deve fazer um programa que apresente a sequência conforme o exemplo abaixo.
 * 
 * Entrada = Não tem entrada.
 * 
 * Saída = Imprima a sequência conforme exemplo abaixo.
 * 
 */

package Exercicios_Basicos;

public class Ex_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2; 
		
		for(n1 = 1; n1 <= 9; n1 += 2) {
			
			for(n2 = 7; n2 >= 5; n2--) {
				
				System.out.printf("L = [%d], J = [%d] \n ", n1, n2);
			}
		}
	}

}
