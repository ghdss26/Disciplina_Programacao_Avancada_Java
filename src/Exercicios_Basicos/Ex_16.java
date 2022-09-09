/* 
 * Supondo que a população de um país A seja recebido via teclado em uma
	variável com dupla precisão (double) representando a população atual daquele país
	que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
	país B seja recebida também em uma variável com dupla precisão e que tenha uma
	taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos
	necessários para que a população do país A ultrapasse ou iguale a população do
	número do país B, mantida essas taxas de crescimento.
	
	Entrada
	O arquivo de entrada contém um valor referente a população do país A(POPA) e um
	outro valor inteiro referente a população do país B(POPB). A população do país B
	tem que ser superior ou igual a do país A, ou seja : (POPB > POPA).
	
	Saída
	Deve ser mostrado a quantidade de anos que a população do país B ultrapasse ou
	se iguale a do país A.
 * */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double popA; 
		double popB;
		
		double contador = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a Taxa de População do país A: "); 
		popA = sc.nextDouble(); 
		
		System.out.println("Informe a Taxa de População do país B: "); 
		popB = sc.nextDouble(); 
		
		while(popB > popA) {
			
			popA += (popA * 3) / 100; 
			popB += (popB * 1.5) / 100; 
			
			contador++; 
		}
		
		System.out.println("Taxa de Anos da População: " + contador + " anos.");
	}

}
