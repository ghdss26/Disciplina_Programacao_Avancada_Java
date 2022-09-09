/**
 * 
 *  Toda apresentação de trabalho tem seus requisitos mínimos, que precisam ser 
 *  atendidos, caso contrário, o trabalho não é aceito e o aluno fica com nota 0. 
 *  A apresentação de Programação 1 está chegando, e o Professor José deixou claro 
 *  que se os trabalhos não passassem por todos os requisitos mínimos, ele não iria julgar o trabalho.
 *  
 *  Eis os requisitos: 
 *  
 *  Requisito 1: Interface gráfica ou Inteligência Artificial. 
 *  Requisito 2: Encapsulamento e Indentação 
 *  Requisito 3: Uso de Structs
 *  
 *  Dada a entrada, descubra se o aluno ficou com 0 ou o seu trabalho será avaliado.
 *  
 *  Entrada = A entrada é composta de 5 números, representando respectivamente 
 *  Interface Gráfica, Inteligência Artificial, Encapsulamento, Indentação e Structs. 
 *  
 *  Os números podem ser: 0 - Se o trabalho não possui tal quesito. 1 - Se trabalho possui tal quesito. 
 *  
 *  Saída Deve imprimir o número 0, se o aluno não atender aos requisitos e ficará com zero, 
 *  e a frase "AVALIADO" se ele atendeu aos requisitos mínimos.
 *  
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		
		int[] requisitos = new int[5]; 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < requisitos.length; i++) {
			
			System.out.printf("Informe o [%d] registro: ", i);
			requisitos[i] = sc.nextInt(); 
			
			if(requisitos[i] < 0 || requisitos[i] > 1) {
				
				System.out.println("Inválido"); 
				break;
			}
		}
		
		if( requisitos[2] == 1) {
			
			System.out.println("Avaliados"); 
			
		} else {
			
			System.out.println("0 (Zero)");
		}

	}
}
