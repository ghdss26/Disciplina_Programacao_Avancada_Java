/** 
 * Um número é palíndromo se ele pode ser lido de trás para frente e ainda assim 
 * obtermos o mesmo valor. Por exemplo: 10301 é palíndromo, já 12342 não é. Então, 
 * dado um número de 5 algarismos, você deve determinar se ele é palíndromo.
 * 
 * Entrada = Um número inteiro de 5 algarismos. 
 * 
 * Saída = S se o número é palíndromo e N se ele não é.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
	
		int primeiro, segundo, terceiro, quarto, quinto; 
		int valor;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe um valor: ");
		valor = sc.nextInt(); 
		
		if(valor < 10000 && valor > 99999) {
			
			System.out.println("Valor inválido, Informe um número correto: "); 
			valor = sc.nextInt(); 
		}
		
		quinto = valor % 10; 
		valor /= 10; 
		
		quarto = valor % 10; 
		valor /= 10; 
		
		terceiro = valor % 10; 
		terceiro = terceiro + 0;
		valor /= 10;
		
		segundo = valor % 10;
		valor /= 10; 
		
		primeiro = valor % 10; 
		
		if(primeiro == quinto && segundo == quarto) {
			
			System.out.println("Sim");
			
		} else {
			
			System.out.println("Não");
		}
	}

}
