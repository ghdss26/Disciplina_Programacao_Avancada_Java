/** 
 * 
 * 	Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
	sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
	duração mínima de 1 hora e máxima de 24 horas.
 * 
 * 	Entrada = A entrada contém dois valores inteiros representando a hora de início e a hora de
	fim do jogo.
	
	Saída = Apresente a duração do jogo conforme exemplo abaixo.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora_inicial, hora_final;
		int duracao_jogo; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("informe a hora que vai começar o jogo: ");
		hora_inicial = sc.nextInt(); 
		
		System.out.println("Informe a hora que vai encerrar o jogo: "); 
		hora_final = sc.nextInt(); 
		
		if (hora_inicial > hora_final) {
			
			duracao_jogo = (24 - (hora_inicial - hora_final)); 
			
			System.out.println("O Jogo durou: " + duracao_jogo + " HORAS(S) ");
			
		} else if (hora_final > hora_inicial) {
			
			duracao_jogo = (hora_final - hora_inicial); 
			System.out.println("O Jogo durou: " + duracao_jogo + " HORAS(S) ");
			
		} else {
			
			System.out.println(" O Jogo durou 24 horas. ");
		}
	}

}
