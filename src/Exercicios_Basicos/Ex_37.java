/**
 * 
 * Amarelinha provavelmente é a brincadeira em que as crianças da vila mais se 
 * divertem, porém a mesma vem causando um bom tempo de discussão e choro nas 
 * crianças que a praticam. A causa do transtorno é para decidir quem será o próximo 
 * a pular, mas recentemente, Quico (O gênio!) teve uma grande ideia para solucionar 
 * o problema. Basicamente a brincadeira só poderá ser jogada de dois em dois 
 * jogadores e para escolher o próximo jogador, Quico indicou o uso do tradicional 
 * método par ou ímpar, onde os dois jogadores informam um número e se a soma 
 * desses números for par o jogador que escolheu PAR ganha ou vice versa. 
 * Entretanto a utilização desse método vem deixando o Quico louco, louco, louco... E 
 * por esse motivo ele pediu a sua ajuda! Solicitou a você um programa que dado o 
 * nome dos jogadores, suas respectivas escolhas PAR ou ÍMPAR e os números, 
 * informe quem foi o vencedor.
 * 
 * Entrada = Cada caso de teste contém duas linhas. Na primeira linha será informado o nome do 
 * jogador 1 seguido de sua escolha, “PAR” ou "ÍMPAR" e o número escolhido, logo 
 * após, o nome do jogador 2 seguido de sua escolha, “PAR” ou "ÍMPAR” e o número 
 * escolhido. É garantido que a escolha (PAR ou ÍMPAR) do jogador 1 será diferente da 
 * escolha (PAR ou ÍMPAR) do jogador 2 e que o nome dos jogadores são formados 
 * somente por letras e não ultrapassarão 10 caracteres.
 * 
 * Saída Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[2]; 
		int[] numero = new int[2]; 
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.printf("[%d] nome: ", i);
			nome[i] = sc.next(); 
			
			System.out.printf("[%d] número: ", i); 
			numero[i] = sc.nextInt();
		}
		
		if(numero[0] % 2 == 0 || numero[1] % 2 == 0) {
			
			int soma = numero[0] + numero[1]; 
			
			System.out.println("Par");
			System.out.println("Somátorio vai ser: " + soma); 
			System.out.println("Ganhador: " + nome[1]);
			
		} else {
			
			int soma = numero[0] + numero[1]; 
			
			System.out.println("Impar");
			System.out.println("Somátorio vai ser: " + soma); 
			System.out.println("Ganhador: " + nome[0]);
		}
		
	}
}
