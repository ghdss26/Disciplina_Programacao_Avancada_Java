/** 
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
 * Calcule e imprima a média semestral. Faça com que o programa só aceita notas 
 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
 * 
 * Entrada = A entrada contém vários valores reais, positivos ou negativos.
 * 
 * Saída Se uma nota inválida for lida deve ser impressa a mensagem “NOTA INVÁLIDA”. 
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem "MÉDIA = " seguido do valor do cálculo.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double nota1, nota2; 
		
		double media; 
		
		System.out.println("Informe a primeira nota: "); 
		nota1 = sc.nextDouble(); 
		
		System.out.println("Informe a segunda nota: "); 
		nota2 = sc.nextDouble(); 
		
		if(nota1 < 0 || nota1 > 10 && nota2 < 0 || nota2 > 10) {
			
			System.out.println("Nota inválida"); 
			
		} else { 
			
			media = (nota1 + nota2) / 2; 
			
			System.out.printf("A Média vai ser: %.2f", media);
			
			if(media < -3.5) {
				
				System.out.println("Média inválida");
			}
			
		}
		
	}
}
