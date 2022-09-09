/** 
 * Faça um programa que receba via teclado o tempo de duração de um evento em
 * uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
   expresso em horas, minutos e segundos.
   
  Entrada
	O arquivo de entrada contém valores com inteiros (int) referente a quantidade de
	segundos informada.
	
	Saída
	Imprima a conversão realizada em HH (horas), MM (minutos) e Segundos (SS).
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int segundos, h, m, s, resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os segundos: "); 
		segundos = sc.nextInt(); 
		
		h = segundos / 3600; 
		resto = segundos % 3600;
		m = resto / 60;
		s = resto % 60;
		
		System.out.printf("%d:%d:%d", h, m, s);
	}
}
