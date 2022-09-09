/*
 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7.

Entrada = A entrada contém vários casos de teste. A primeira linha da entrada contém um
inteiro N (1 < N <= 100), indicando o número de casos de teste da entrada. Cada
uma das N linhas seguintes contém um valor inteiro X (1 < X <= 107), que pode ser
ou não, um número primo.

Saída = Para cada caso de teste de entrada, imprima a mensagem “X é primo" ou “X não é
primo”, de acordo com a especificação fornecida.

 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int n; 
		int a, b, d;
		int cont; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		for(a = 0; a < n; a++) {
			
			cont = 1; 
			
			System.out.println("Informe um outro número: "); 
			b = sc.nextInt();  
			
			for(d = 2; d < b; d++) {
				
				if(b % d == 0) {
					
					cont++; 
				}
			}
			
			if(cont == 1 &&  b!= 1) {
				
				System.out.println("O número: " + b + " é primo"); 
				
			} else {
				
				System.out.println("O número: " + b + " não é primo");
			}
		}
	}

}
