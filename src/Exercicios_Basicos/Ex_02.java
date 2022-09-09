/** 
 * Escreva um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
decimais, representando o número, quantidade de horas trabalhadas e o valor que o
funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um
espaço em branco antes e depois da igualdade. No caso do salário, também deve
haver um espaço em branco após o R$
*/

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		int funcionario; 
		int horas_trabalhadas; 
		double valor_hora;
		double salario;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe o número do funcíonario: ");
		funcionario = numero.nextInt();  
		
		System.out.println("Informe o número de horas trabalhadas: "); 
		horas_trabalhadas = numero.nextInt(); 
		
		System.out.println("Informe o valor que recebe por hora"); 
		valor_hora = numero.nextDouble(); 
		
		double salario_funcionario = horas_trabalhadas * valor_hora;
		
		System.out.println("O número do funcionario é: " + funcionario);
		System.out.printf("O valor do Salário é de: R$ %.2f", salario_funcionario);
	}

}
