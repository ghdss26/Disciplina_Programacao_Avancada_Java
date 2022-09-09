/*
 * Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de
dupla precisão (double) com duas casas decimais, representando o salário fixo do
vendedor e montante total das vendas efetuadas por este vendedor,
respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		String nome; 
		double salario_fixo; 
		double vendas_mes; 
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe o nome do Funciónario: "); 
		nome = numero.nextLine(); 
		
		System.out.println("Informe o salário fixo: "); 
		salario_fixo = numero.nextDouble(); 
		
		System.out.println("Informe as vendas no mês: "); 
		vendas_mes = numero.nextDouble(); 
		
		double total_vendas_mes = salario_fixo + vendas_mes * 0.15 ; 
		
		System.out.println("O Funcionario: " + nome);
		System.out.printf("Vai receber no de Total que o funcionário vai receber: R$ %.2f", total_vendas_mes);
	}
}
