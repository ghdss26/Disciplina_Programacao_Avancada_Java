/** 
 * 
 * Vovó Rosa e seus colegas de turma foram ao cinema assistir a um filme, mas 
 * ficaram estarrecidos com o aumento do preço do ingresso. Revoltados, eles 
 * decidiram fazer uma manifestação contra o sistema capitalista opressor, agendada 
 * para amanhã na Praça José de Alencar. Vovó Rosa quer colaborar com o 
 * movimento fazendo um cartaz com a seguinte palavra de ordem:
 * 
 * Mas ela não é muito boa em Matemática, e está solicitando sua ajuda para calcular 
 * a porcentagem de que precisa para completar o cartaz.
 * 
 * Entrada = A única linha da entrada consiste de dois valores A e B (0.00 < A <= B <= 1000.00), 
 * representam respectivamente o valor antigo e o valor novo do ingresso do cinema.
 * 
 * Saída = A única linha da saída deve consistir unicamente de um valor, que represente como 
 * uma porcentagem o aumento do valor do ingresso. O valor deve ser acompanhado 
 * do símbolo % e conter exatos dois dígitos após o ponto separador decimal.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: "); 
		A = sc.nextDouble(); 
		
		System.out.println("Informe o segundo valor: "); 
		B = sc.nextDouble(); 
		
		p = ((B * 100 / A) - 100.00);
		
		System.out.println(p + "%");
	}

}
