
/* 
 * Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder 
 * aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500, 
 * terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de 
 * 7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa 
 * que receba como entrada o salário atual de um funcionário, calcule e exiba o valor 
 * de seu novo salário já com o aumento concedido.
 * 
 * Entrada
 * 
 * Você receberá um único número com dupla precisão (double)
 * 
 * Saída
 * 
 * Você deve imprimir o número também com dupla precisão com resultado do processamento.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		
		double salario_atual; 
		double novo_salario; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário do funcionário: "); 
		salario_atual = sc.nextDouble();  
		
		if(salario_atual >= 500.00) {
			
			novo_salario = salario_atual + (salario_atual * 10) / 100;
			
		} else if(salario_atual >= 300.00) {
			
			novo_salario = salario_atual +  (salario_atual * 7) / 100; 
			
		} else {
			
			novo_salario = salario_atual +  (salario_atual * 5) / 100; 
		}
		
		System.out.printf("O Salário do funcionário é de: %.2f", novo_salario);
	}
	

}
