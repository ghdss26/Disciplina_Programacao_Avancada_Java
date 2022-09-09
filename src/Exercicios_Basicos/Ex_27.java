/** 
 * 
 * Genival tem muito medo de ter diabetes e, por isso, o médico pediu que ele 
 * medisse sua glicose ao longo do dia para ver se ela estava controlada. Escreva um 
 * programa que receba como entrada 4 quatro medições dos valores da taxa de 
 * glicose de Genival, para cada valor informado informe NORMAL ou ALTERADA e ao 
 * final calcule a glicose média observada naquele dia.
 * 
 * Caso esse valor seja inferior a 110, o programa deve exibir a mensagem NORMAL, 
 * se tiver entre 110 e 125 exibir a mensagem ALTERADA, acima de 125, a mensagem 
 * exibida deve ser MUITO ALTA.
 * 
 * Entrada = Quatro valores inteiros representando o resultado das medições feitas no dia.
 * 
 * Saída = Uma das seguintes mensagens: NORMAL, ALTERADA ou MUITO ALTA e o valor 
 * médio das medições ao final do processamento.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] medicoes = new double[4]; 
		
		double media_aritmetica = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < medicoes.length; i++) {
			
			System.out.printf("Informe a [%d] Medição para a taxa de glicose: ", i); 
			medicoes[i] = sc.nextDouble(); 
			
			media_aritmetica = medicoes[i] + medicoes[i] + medicoes[i] + medicoes[i] / 4;
			
			if(medicoes[i] < 110) {
				
				System.out.println("Taxa de Glicose Normal"); 
				
			} else if(medicoes[i] < 125) { 
				
				System.out.println("Taxa de Glicose Alterada"); 
				
			} else if(medicoes[i] > 125) {
				
				System.out.println("Taxa de Glicose Muito Alta"); 
			}
		}
		
		System.out.printf("Média das Leituras: %.2f", media_aritmetica);
		
	}

}
