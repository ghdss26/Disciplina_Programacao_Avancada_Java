/**
 * 
 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de 
 * linhas de saída que serão apresentadas na execução do programa.
 * 
 * Entrada O arquivo de entrada contém um número inteiro positivo N. 
 * 
 * Saída = Imprima a saída conforme o exemplo fornecido abaixo.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int N; 
		
		System.out.println("Informe um Número: "); 
		N = sc.nextInt(); 
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(i + " " + (i * i) + " " + (i * i * i)); 
		}
	}

}
