/** 
 * Leia dois valores inteiros M e N. A cada leitura, calcule e escreva a soma dos 
 * fatoriais de cada um dos valores lidos. Utilize um tipo de variável apropriada, pois 
 * cálculo pode resultar em um valor com mais de 15 dígitos.
 * 
 * Entrada = Cada caso contém dois números inteiros M (0 <= M <= 20) e N (0 <= N <= 20). 
 * 
 * Saída = Para cada caso de teste de entrada, seu programa deve imprimir uma única linha, 
 * contendo um número que é a soma de ambos os fatoriais (de M e N).
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long m = 0; 
		long n = 0; 
		
		long[] fat = new long[21];
		
		fat[0] = 1; 
		
		for(int i = 1; i <= 1; i++) {
			
			System.out.println("Informe o valor de M: "); 
			m = sc.nextLong(); 
			
			System.out.println("Informe o valor de N: ");
			n = sc.nextLong();
		}
		
		for(int i = 1; i <= 20; i++) {
			
			fat[i] = fat[i-1]*i;
		}
		
		System.out.println(fat[(int) m] + fat[(int) n]);
	}

}
