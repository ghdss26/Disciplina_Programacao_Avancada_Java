/*
 * A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
 * Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
 * dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N 
 * primeiros números dessa série.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N< 46).
 * 
 * Saída
 * Os valores devem ser mostrados na mesma linha, separados por um espaço em
 * branco. Não deve haver espaço após o último valor.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, a = 0, p = 0, atual = 1;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt(); 
		
		for(int i = 0; i < n; i++) {
			
			if(i == n) {
				
				System.out.println(a); 
				
			} else {
				
				System.out.println(a + " "); 
				
				p = a + atual;
				a = atual;
				atual = p;
			}
		}
	}
}
